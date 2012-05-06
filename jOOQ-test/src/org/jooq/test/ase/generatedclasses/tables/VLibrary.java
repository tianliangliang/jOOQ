/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.ase.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 266809394;

	/**
	 * The singleton instance of dbo.v_library
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.ase.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.ase.generatedclasses.tables.records.VLibraryRecord.class;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("v_library", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}
}
