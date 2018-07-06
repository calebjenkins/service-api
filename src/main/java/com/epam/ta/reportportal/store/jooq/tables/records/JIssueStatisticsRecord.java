/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.tables.JIssueStatistics;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JIssueStatisticsRecord extends UpdatableRecordImpl<JIssueStatisticsRecord>
		implements Record5<Long, Long, Integer, Long, Long> {

	private static final long serialVersionUID = -1151686152;

	/**
	 * Setter for <code>public.issue_statistics.id</code>.
	 */
	public void setId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.issue_statistics.id</code>.
	 */
	public Long getId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.issue_statistics.issue_type_id</code>.
	 */
	public void setIssueTypeId(Long value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.issue_statistics.issue_type_id</code>.
	 */
	public Long getIssueTypeId() {
		return (Long) get(1);
	}

	/**
	 * Setter for <code>public.issue_statistics.counter</code>.
	 */
	public void setCounter(Integer value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.issue_statistics.counter</code>.
	 */
	public Integer getCounter() {
		return (Integer) get(2);
	}

	/**
	 * Setter for <code>public.issue_statistics.item_id</code>.
	 */
	public void setItemId(Long value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.issue_statistics.item_id</code>.
	 */
	public Long getItemId() {
		return (Long) get(3);
	}

	/**
	 * Setter for <code>public.issue_statistics.launch_id</code>.
	 */
	public void setLaunchId(Long value) {
		set(4, value);
	}

	/**
	 * Getter for <code>public.issue_statistics.launch_id</code>.
	 */
	public Long getLaunchId() {
		return (Long) get(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Long, Long, Integer, Long, Long> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Long, Long, Integer, Long, Long> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JIssueStatistics.ISSUE_STATISTICS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return JIssueStatistics.ISSUE_STATISTICS.ISSUE_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return JIssueStatistics.ISSUE_STATISTICS.COUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return JIssueStatistics.ISSUE_STATISTICS.ITEM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return JIssueStatistics.ISSUE_STATISTICS.LAUNCH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component2() {
		return getIssueTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer component3() {
		return getCounter();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component4() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component5() {
		return getLaunchId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getIssueTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getCounter();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getLaunchId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatisticsRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatisticsRecord value2(Long value) {
		setIssueTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatisticsRecord value3(Integer value) {
		setCounter(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatisticsRecord value4(Long value) {
		setItemId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatisticsRecord value5(Long value) {
		setLaunchId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatisticsRecord values(Long value1, Long value2, Integer value3, Long value4, Long value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JIssueStatisticsRecord
	 */
	public JIssueStatisticsRecord() {
		super(JIssueStatistics.ISSUE_STATISTICS);
	}

	/**
	 * Create a detached, initialised JIssueStatisticsRecord
	 */
	public JIssueStatisticsRecord(Long id, Long issueTypeId, Integer counter, Long itemId, Long launchId) {
		super(JIssueStatistics.ISSUE_STATISTICS);

		set(0, id);
		set(1, issueTypeId);
		set(2, counter);
		set(3, itemId);
		set(4, launchId);
	}
}
