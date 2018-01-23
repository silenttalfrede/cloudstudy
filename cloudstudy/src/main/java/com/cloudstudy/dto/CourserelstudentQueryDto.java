package com.cloudstudy.dto;

import java.util.HashSet;

import com.cloudstudy.constant.SearchType;

@SuppressWarnings("unused")
public class CourserelstudentQueryDto {

	private HashSet<SearchType> searchTypeSet = new HashSet<SearchType>() {
		private static final long serialVersionUID = 1L;
		{
			searchTypeSet.add(SearchType.all);
			searchTypeSet.add(SearchType.adminName);
			searchTypeSet.add(SearchType.teacherName);
			searchTypeSet.add(SearchType.studentName);
			searchTypeSet.add(SearchType.courseName);
			searchTypeSet.add(SearchType.homeworkName);
			searchTypeSet.add(SearchType.no);
			searchTypeSet.add(SearchType.account);
			searchTypeSet.add(SearchType.phone);
			searchTypeSet.add(SearchType.email);

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
	 * 分数从
	 */
	private Integer fromGrade;

	/**
	 * 分数到
	 */
	private Integer toGrade;

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

	public Integer getFromGrade() {
		return fromGrade;
	}

	public void setFromGrade(Integer fromGrade) {
		this.fromGrade = fromGrade;
	}

	public Integer getToGrade() {
		return toGrade;
	}

	public void setToGrade(Integer toGrade) {
		this.toGrade = toGrade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CourserelstudentQueryDto [searchTypeSet=");
		builder.append(searchTypeSet);
		builder.append(", searchType=");
		builder.append(searchType);
		builder.append(", fromTime=");
		builder.append(fromTime);
		builder.append(", toTime=");
		builder.append(toTime);
		builder.append(", fromGrade=");
		builder.append(fromGrade);
		builder.append(", toGrade=");
		builder.append(toGrade);
		builder.append(", keyword=");
		builder.append(keyword);
		builder.append(", pageDto=");
		builder.append(pageDto);
		builder.append("]");
		return builder.toString();
	}

}