/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
public class TBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.h2.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = 1314361076;

	/**
	 * The singleton instance of PUBLIC.T_BOOK_STORE
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.h2.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The books store name
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		super("T_BOOK_STORE", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TBookStoreRecord> getMainKey() {
		return org.jooq.test.h2.generatedclasses.Keys.UK_T_BOOK_STORE_NAME;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.h2.generatedclasses.Keys.UK_T_BOOK_STORE_NAME);
	}
}
