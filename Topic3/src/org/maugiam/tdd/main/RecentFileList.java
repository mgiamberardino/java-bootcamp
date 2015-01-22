/**
 * 
 */
package org.maugiam.tdd.main;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Mauro J Giamberardino
 *
 */
public class RecentFileList {

	protected Integer limit;
	protected LinkedList<String> fileList;

	public RecentFileList(Integer limit) {
		this.fileList = new LinkedList<String>();
		this.limit = limit;
	}

	public List<String> getRecentList() {
		return fileList;
	}

	public void addOpenedFile(String filePath) {
		int index = fileList.indexOf(filePath);
		if (index < 0) {
			if (fileList.size() >= limit){
				fileList.removeLast();
			}
			fileList.push(filePath);
		} else {
			fileList.push(fileList.remove(index));
		}
	}

}
