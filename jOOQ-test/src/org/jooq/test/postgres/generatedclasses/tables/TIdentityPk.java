/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TIdentityPk extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityPkRecord> {

	private static final long serialVersionUID = 1812137998;

	/**
	 * The singleton instance of public.t_identity_pk
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TIdentityPk T_IDENTITY_PK = new org.jooq.test.postgres.generatedclasses.tables.TIdentityPk();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityPkRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TIdentityPkRecord.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, this);

	public TIdentityPk() {
		super("t_identity_pk", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	public TIdentityPk(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.postgres.generatedclasses.Keys.IDENTITY_T_IDENTITY_PK;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityPkRecord> getMainKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_T_IDENTITY_PK;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityPkRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityPkRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_T_IDENTITY_PK);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TIdentityPk as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TIdentityPk(alias);
	}
}
