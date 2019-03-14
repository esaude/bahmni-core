package org.bahmni.module.bahmnicore.contract.patient.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PatientDuplicateBirthDateQueryHelperTest {

	@Test
	public void shouldReturnWhereClauseWhenWildCardParameterWithNull() throws Exception {
		PatientDuplicateBirthDateQueryHelper patientDuplicateBirthDateQueryHelper = new PatientDuplicateBirthDateQueryHelper(null,null);
		String whereClause = patientDuplicateBirthDateQueryHelper.appendToWhereClause("where clause");
		assertEquals("where clause", whereClause);
	}

	@Test
	public void shouldReturnWhereClauseWhenWildCardParameterWithEmptyString() throws Exception {
		PatientDuplicateBirthDateQueryHelper patientDuplicateBirthDateQueryHelper = new PatientDuplicateBirthDateQueryHelper("","");
		String whereClause = patientDuplicateBirthDateQueryHelper.appendToWhereClause("where clause");
		assertEquals("where clause", whereClause);
	}

	@Test
	public void shouldReturnWhereClauseWithBirthDateSearchCondition() throws Exception {
		PatientDuplicateBirthDateQueryHelper patientDuplicateBirthDateQueryHelper = new PatientDuplicateBirthDateQueryHelper("1989-02-24","1991-02-24");
		String whereClause = patientDuplicateBirthDateQueryHelper.appendToWhereClause("where clause");
		assertEquals("where clause and ( p.birthdate between  '1989-02-24' and '1991-02-24')", whereClause);
	}
}
