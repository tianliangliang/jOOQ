/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_877 extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.T_877Record> {

	private static final long serialVersionUID = -1264057529;

	/**
	 * The singleton instance of PUBLIC.T_877
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.T_877 T_877 = new org.jooq.test.h2.generatedclasses.tables.T_877();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.T_877Record> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.T_877Record.class;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_877Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_877);

	/**
	 * No further instances allowed
	 */
	private T_877() {
		super("T_877", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.h2.generatedclasses.tables.records.T_877Record, java.lang.Integer> getIdentity() {
		return org.jooq.test.h2.generatedclasses.Keys.IDENTITY_T_877;
	}
}
