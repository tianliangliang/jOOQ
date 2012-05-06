/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_658Ref extends org.jooq.impl.TableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord> {

	private static final long serialVersionUID = -931965164;

	/**
	 * The singleton instance of t_658_ref
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.T_658Ref T_658_REF = new org.jooq.test.sqlite.generatedclasses.tables.T_658Ref();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord.class;
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_t_658_ref_t_658_11_1
	 * FOREIGN KEY (ref_11)
	 * REFERENCES t_658_11 (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.sqlite.generatedclasses.enums.T_658_11> REF_11 = createField("ref_11", org.jooq.impl.SQLDataType.CHAR.asMasterDataType(org.jooq.test.sqlite.generatedclasses.enums.T_658_11.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_t_658_ref_t_658_21_1
	 * FOREIGN KEY (ref_21)
	 * REFERENCES t_658_21 (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.sqlite.generatedclasses.enums.T_658_21> REF_21 = createField("ref_21", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.sqlite.generatedclasses.enums.T_658_21.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_t_658_ref_t_658_31_1
	 * FOREIGN KEY (ref_31)
	 * REFERENCES t_658_31 (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.sqlite.generatedclasses.enums.T_658_31> REF_31 = createField("ref_31", org.jooq.impl.SQLDataType.BIGINT.asMasterDataType(org.jooq.test.sqlite.generatedclasses.enums.T_658_31.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_t_658_ref_t_658_12_1
	 * FOREIGN KEY (ref_12)
	 * REFERENCES t_658_12 (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.sqlite.generatedclasses.enums.T_658_12> REF_12 = createField("ref_12", org.jooq.impl.SQLDataType.CHAR.asMasterDataType(org.jooq.test.sqlite.generatedclasses.enums.T_658_12.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_t_658_ref_t_658_22_1
	 * FOREIGN KEY (ref_22)
	 * REFERENCES t_658_22 (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.sqlite.generatedclasses.enums.T_658_22> REF_22 = createField("ref_22", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.sqlite.generatedclasses.enums.T_658_22.class), T_658_REF);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_t_658_ref_t_658_32_1
	 * FOREIGN KEY (ref_32)
	 * REFERENCES t_658_32 (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.sqlite.generatedclasses.enums.T_658_32> REF_32 = createField("ref_32", org.jooq.impl.SQLDataType.BIGINT.asMasterDataType(org.jooq.test.sqlite.generatedclasses.enums.T_658_32.class), T_658_REF);

	/**
	 * No further instances allowed
	 */
	private T_658Ref() {
		super("t_658_ref");
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, ?>>asList();
	}
}
