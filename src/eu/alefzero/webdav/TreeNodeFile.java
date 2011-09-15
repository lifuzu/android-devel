/* ownCloud Android client application
 *   Copyright (C) 2011  Bartek Przybylski
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package eu.alefzero.webdav;

import java.sql.Date;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import eu.alefzero.webdav.TreeNode.NodeProperty;

import android.util.Xml;

public class TreeNodeFile extends TreeNode {

  public TreeNodeFile() {
    is_pinned_ = false;
    pathToDownloadedFile_ = "";
    lastUpdateDate_ = new Date(1970, 1, 1);
  }
  
  @Override
  void refreshData(Document document) {
    /*if (is_pinned_) {
      String fullPath = getProperty(NodeProperty.PATH);
      if (document.hasChildNodes()) {
        Node child = document.getFirstChild();
        do {
          
        } while ((child = child.getNextSibling()) != null); 
      }
      
      //TODO: update file
    }*/
  }
  
  private boolean is_pinned_;
  private String pathToDownloadedFile_;
  private Date lastUpdateDate_;
}