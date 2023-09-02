// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package solver.proxies;

public class SolverTest extends quizapp.proxies.RemoteObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Solver.SolverTest";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TestId("TestId"),
		TotalSpentTime("TotalSpentTime"),
		CorrectAnswerCount("CorrectAnswerCount"),
		WrongAnswerCount("WrongAnswerCount"),
		EmptyAnswerCount("EmptyAnswerCount"),
		TestName("TestName"),
		TestStatus("TestStatus"),
		_Id("_Id"),
		CustomCreatedDate("CustomCreatedDate"),
		CustomChangedDate("CustomChangedDate"),
		CustomCreatedDateAsLong("CustomCreatedDateAsLong"),
		CustomChangedDateAsLong("CustomChangedDateAsLong"),
		SolverTest_Lecture("Solver.SolverTest_Lecture"),
		RemoteObject_Account_CreatedBy("QuizApp.RemoteObject_Account_CreatedBy"),
		RemoteObject_Account_ChangedBy("QuizApp.RemoteObject_Account_ChangedBy");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SolverTest(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected SolverTest(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject solverTestMendixObject)
	{
		super(context, solverTestMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, solverTestMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static solver.proxies.SolverTest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new solver.proxies.SolverTest(context, mendixObject);
	}

	public static solver.proxies.SolverTest load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return solver.proxies.SolverTest.initialize(context, mendixObject);
	}

	public static java.util.List<solver.proxies.SolverTest> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> solver.proxies.SolverTest.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of TestId
	 */
	public final java.lang.Long getTestId()
	{
		return getTestId(getContext());
	}

	/**
	 * @param context
	 * @return value of TestId
	 */
	public final java.lang.Long getTestId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.TestId.toString());
	}

	/**
	 * Set value of TestId
	 * @param testid
	 */
	public final void setTestId(java.lang.Long testid)
	{
		setTestId(getContext(), testid);
	}

	/**
	 * Set value of TestId
	 * @param context
	 * @param testid
	 */
	public final void setTestId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long testid)
	{
		getMendixObject().setValue(context, MemberNames.TestId.toString(), testid);
	}

	/**
	 * @return value of TotalSpentTime
	 */
	public final java.math.BigDecimal getTotalSpentTime()
	{
		return getTotalSpentTime(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalSpentTime
	 */
	public final java.math.BigDecimal getTotalSpentTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.TotalSpentTime.toString());
	}

	/**
	 * Set value of TotalSpentTime
	 * @param totalspenttime
	 */
	public final void setTotalSpentTime(java.math.BigDecimal totalspenttime)
	{
		setTotalSpentTime(getContext(), totalspenttime);
	}

	/**
	 * Set value of TotalSpentTime
	 * @param context
	 * @param totalspenttime
	 */
	public final void setTotalSpentTime(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal totalspenttime)
	{
		getMendixObject().setValue(context, MemberNames.TotalSpentTime.toString(), totalspenttime);
	}

	/**
	 * @return value of CorrectAnswerCount
	 */
	public final java.lang.Integer getCorrectAnswerCount()
	{
		return getCorrectAnswerCount(getContext());
	}

	/**
	 * @param context
	 * @return value of CorrectAnswerCount
	 */
	public final java.lang.Integer getCorrectAnswerCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.CorrectAnswerCount.toString());
	}

	/**
	 * Set value of CorrectAnswerCount
	 * @param correctanswercount
	 */
	public final void setCorrectAnswerCount(java.lang.Integer correctanswercount)
	{
		setCorrectAnswerCount(getContext(), correctanswercount);
	}

	/**
	 * Set value of CorrectAnswerCount
	 * @param context
	 * @param correctanswercount
	 */
	public final void setCorrectAnswerCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer correctanswercount)
	{
		getMendixObject().setValue(context, MemberNames.CorrectAnswerCount.toString(), correctanswercount);
	}

	/**
	 * @return value of WrongAnswerCount
	 */
	public final java.lang.Integer getWrongAnswerCount()
	{
		return getWrongAnswerCount(getContext());
	}

	/**
	 * @param context
	 * @return value of WrongAnswerCount
	 */
	public final java.lang.Integer getWrongAnswerCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.WrongAnswerCount.toString());
	}

	/**
	 * Set value of WrongAnswerCount
	 * @param wronganswercount
	 */
	public final void setWrongAnswerCount(java.lang.Integer wronganswercount)
	{
		setWrongAnswerCount(getContext(), wronganswercount);
	}

	/**
	 * Set value of WrongAnswerCount
	 * @param context
	 * @param wronganswercount
	 */
	public final void setWrongAnswerCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer wronganswercount)
	{
		getMendixObject().setValue(context, MemberNames.WrongAnswerCount.toString(), wronganswercount);
	}

	/**
	 * @return value of EmptyAnswerCount
	 */
	public final java.lang.Integer getEmptyAnswerCount()
	{
		return getEmptyAnswerCount(getContext());
	}

	/**
	 * @param context
	 * @return value of EmptyAnswerCount
	 */
	public final java.lang.Integer getEmptyAnswerCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.EmptyAnswerCount.toString());
	}

	/**
	 * Set value of EmptyAnswerCount
	 * @param emptyanswercount
	 */
	public final void setEmptyAnswerCount(java.lang.Integer emptyanswercount)
	{
		setEmptyAnswerCount(getContext(), emptyanswercount);
	}

	/**
	 * Set value of EmptyAnswerCount
	 * @param context
	 * @param emptyanswercount
	 */
	public final void setEmptyAnswerCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer emptyanswercount)
	{
		getMendixObject().setValue(context, MemberNames.EmptyAnswerCount.toString(), emptyanswercount);
	}

	/**
	 * @return value of TestName
	 */
	public final java.lang.String getTestName()
	{
		return getTestName(getContext());
	}

	/**
	 * @param context
	 * @return value of TestName
	 */
	public final java.lang.String getTestName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TestName.toString());
	}

	/**
	 * Set value of TestName
	 * @param testname
	 */
	public final void setTestName(java.lang.String testname)
	{
		setTestName(getContext(), testname);
	}

	/**
	 * Set value of TestName
	 * @param context
	 * @param testname
	 */
	public final void setTestName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String testname)
	{
		getMendixObject().setValue(context, MemberNames.TestName.toString(), testname);
	}

	/**
	 * Get value of TestStatus
	 * @param teststatus
	 */
	public final solver.proxies.ENUM_TestStatus getTestStatus()
	{
		return getTestStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of TestStatus
	 */
	public final solver.proxies.ENUM_TestStatus getTestStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TestStatus.toString());
		if (obj == null) {
			return null;
		}
		return solver.proxies.ENUM_TestStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TestStatus
	 * @param teststatus
	 */
	public final void setTestStatus(solver.proxies.ENUM_TestStatus teststatus)
	{
		setTestStatus(getContext(), teststatus);
	}

	/**
	 * Set value of TestStatus
	 * @param context
	 * @param teststatus
	 */
	public final void setTestStatus(com.mendix.systemwideinterfaces.core.IContext context, solver.proxies.ENUM_TestStatus teststatus)
	{
		if (teststatus != null) {
			getMendixObject().setValue(context, MemberNames.TestStatus.toString(), teststatus.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.TestStatus.toString(), null);
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of SolverTest_Lecture
	 */
	public final builder.proxies.Lecture getSolverTest_Lecture() throws com.mendix.core.CoreException
	{
		return getSolverTest_Lecture(getContext());
	}

	/**
	 * @param context
	 * @return value of SolverTest_Lecture
	 * @throws com.mendix.core.CoreException
	 */
	public final builder.proxies.Lecture getSolverTest_Lecture(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		builder.proxies.Lecture result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SolverTest_Lecture.toString());
		if (identifier != null) {
			result = builder.proxies.Lecture.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of SolverTest_Lecture
	 * @param solvertest_lecture
	 */
	public final void setSolverTest_Lecture(builder.proxies.Lecture solvertest_lecture)
	{
		setSolverTest_Lecture(getContext(), solvertest_lecture);
	}

	/**
	 * Set value of SolverTest_Lecture
	 * @param context
	 * @param solvertest_lecture
	 */
	public final void setSolverTest_Lecture(com.mendix.systemwideinterfaces.core.IContext context, builder.proxies.Lecture solvertest_lecture)
	{
		if (solvertest_lecture == null) {
			getMendixObject().setValue(context, MemberNames.SolverTest_Lecture.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.SolverTest_Lecture.toString(), solvertest_lecture.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final solver.proxies.SolverTest that = (solver.proxies.SolverTest) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
