package org.bahmni.module.bahmnicore.contract.patient.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PatientGenderQueryHelperTest {

	@Test
	public void shouldReturnWhereClauseWhenWildCardParameterWithNull() throws Exception {
		PatientGenderQueryHelper patientGenderQueryHelper = new PatientGenderQueryHelper(null);
		String whereClause = patientGenderQueryHelper.appendToWhereClause("where clause");
		assertEquals("where clause", whereClause);
	}

	@Test
	public void shouldReturnWhereClauseWhenWildCardParameterWithEmptyString() throws Exception {
		PatientGenderQueryHelper patientGenderQueryHelper = new PatientGenderQueryHelper("");
		String whereClause = patientGenderQueryHelper.appendToWhereClause("where clause");
		assertEquals("where clause", whereClause);
	}

	@Test
	public void shouldReturnWhereClauseWithGenderSearchConditionWhenWildCardParameterWithAnyString() throws Exception {
		PatientGenderQueryHelper patientGenderQueryHelper = new PatientGenderQueryHelper("M");
		String whereClause = patientGenderQueryHelper.appendToWhereClause("where clause");
		assertEquals("where clause and ( p.gender like  '%M%')", whereClause);
	}
}
