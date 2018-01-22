package com.cloudstudy.dto;

import java.util.HashSet;

import com.cloudstudy.constant.SearchType;

@SuppressWarnings("unused")
public class HomeworkQueryParamDto {

	private HashSet<SearchType> searchTypeSet = new HashSet<SearchType>() {
		private static final long serialVersionUID = 1L;
		{
			searchTypeSet.add(SearchType.teacherName);
			searchTypeSet.add(SearchType.studentName);
			searchTypeSet.add(SearchType.courseName);
			searchTypeSet.add(SearchType.homeworkName);
			searchTypeSet.add(SearchType.no);
			searchTypeSet.add(SearchType.account);
			searchTypeSet.add(SearchType.fileName);

			searchTypeSet.add(SearchType.courseId);
			searchTypeSet.add(SearchType.taskId);
			searchTypeSet.add(SearchType.jobId);
			searchTypeSet.add(SearchType.teacherNo);
			searchTypeSet.add(SearchType.studentno);

		}
	};
	private Integer searchType;

	/**
	 * 时间开始
	 */
	private String fromTime;

	/**
	 * 时间结束
	 */
	private String toTime;

	/**
	 * 关键字
	 */
	private String keyword;

	private PageDto pageDto;

	public HashSet<SearchType> getSearchTypeSet() {
		return searchTypeSet;
	}

	public void setSearchTypeSet(HashSet<SearchType> searchTypeSet) {
		this.searchTypeSet = searchTypeSet;
	}

	public Integer getSearchType() {
		return searchType;
	}

	public void setSearchType(Integer searchType) {
		this.searchType = searchType;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public PageDto getPageDto() {
		return pageDto;
	}

	public void setPageDto(PageDto pageDto) {
		this.pageDto = pageDto;
	}
}
