/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class V_AUTHOR extends org.jooq.impl.TableImpl<org.jooq.Record> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1394046202;

	/**
	 * The singleton instance of TEST.V_AUTHOR
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR V_AUTHOR = new org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> ADDRESS = createField("ADDRESS", org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.U_ADDRESS_TYPE.getDataType(), this);

	public V_AUTHOR() {
		super("V_AUTHOR", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	public V_AUTHOR(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR(alias);
	}
}
