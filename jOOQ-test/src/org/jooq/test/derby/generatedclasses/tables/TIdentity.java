/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.test.derby.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = 1208798079;

	/**
	 * The singleton instance of TEST.T_IDENTITY
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.TIdentity T_IDENTITY = new org.jooq.test.derby.generatedclasses.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.TIdentityRecord> getRecordType() {
		return org.jooq.test.derby.generatedclasses.tables.records.TIdentityRecord.class;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("VAL", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * No further instances allowed
	 */
	private TIdentity() {
		super("T_IDENTITY", org.jooq.test.derby.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.derby.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.derby.generatedclasses.Keys.IDENTITY_T_IDENTITY;
	}
}
