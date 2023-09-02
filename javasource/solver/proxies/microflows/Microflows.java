// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package solver.proxies.microflows;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public final class Microflows
{
	/**
	 * Private constructor to prevent instantiation of this class. 
	 */
	private Microflows() {}

	// These are the microflows for the Solver module
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_FinishTestBuilder(
		builder.proxies.TestHelper _testHelper
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Solver.ACT_FinishTest");
		builder = builder.withParam("TestHelper", _testHelper);
		return builder;
	}

	public static void aCT_FinishTest(
		IContext context,
		builder.proxies.TestHelper _testHelper
	)
	{
		aCT_FinishTestBuilder(
				_testHelper
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_GenerateSolverTestBuilder(
		builder.proxies.ConnectedSelector _connectedSelector,
		builder.proxies.TestHelper _testHelper
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Solver.ACT_GenerateSolverTest");
		builder = builder.withParam("ConnectedSelector", _connectedSelector);
		builder = builder.withParam("TestHelper", _testHelper);
		return builder;
	}

	public static void aCT_GenerateSolverTest(
		IContext context,
		builder.proxies.ConnectedSelector _connectedSelector,
		builder.proxies.TestHelper _testHelper
	)
	{
		aCT_GenerateSolverTestBuilder(
				_connectedSelector,
				_testHelper
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_ReviewTest_FromSolvedTestsBuilder(
		solver.proxies.SolverTest _solverTest
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Solver.ACT_ReviewTest_FromSolvedTests");
		builder = builder.withParam("SolverTest", _solverTest);
		return builder;
	}

	public static void aCT_ReviewTest_FromSolvedTests(
		IContext context,
		solver.proxies.SolverTest _solverTest
	)
	{
		aCT_ReviewTest_FromSolvedTestsBuilder(
				_solverTest
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder dS_ActiveSolverQuestionBuilder(
		builder.proxies.TestHelper _testHelper
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Solver.DS_ActiveSolverQuestion");
		builder = builder.withParam("TestHelper", _testHelper);
		return builder;
	}

	public static solver.proxies.SolverQuestion dS_ActiveSolverQuestion(
		IContext context,
		builder.proxies.TestHelper _testHelper
	)
	{
		Object result = dS_ActiveSolverQuestionBuilder(
				_testHelper
			)
			.execute(context);
		return result == null ? null : solver.proxies.SolverQuestion.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder sUB_ConnectedSelector_GetFromSolverTestBuilder(
		solver.proxies.SolverTest _solverTest
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Solver.SUB_ConnectedSelector_GetFromSolverTest");
		builder = builder.withParam("SolverTest", _solverTest);
		return builder;
	}

	public static builder.proxies.ConnectedSelector sUB_ConnectedSelector_GetFromSolverTest(
		IContext context,
		solver.proxies.SolverTest _solverTest
	)
	{
		Object result = sUB_ConnectedSelector_GetFromSolverTestBuilder(
				_solverTest
			)
			.execute(context);
		return result == null ? null : builder.proxies.ConnectedSelector.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder sUB_QuestionList_GetBy_LectureBuilder(
		builder.proxies.Lecture _lecture
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Solver.SUB_QuestionList_GetBy_Lecture");
		builder = builder.withParam("Lecture", _lecture);
		return builder;
	}

	public static java.util.List<builder.proxies.Question> sUB_QuestionList_GetBy_Lecture(
		IContext context,
		builder.proxies.Lecture _lecture
	)
	{
		Object result = sUB_QuestionList_GetBy_LectureBuilder(
				_lecture
			)
			.execute(context);
		return result == null ? null : com.mendix.utils.ListUtils.map((java.util.List<IMendixObject>) result, obj -> builder.proxies.Question.initialize(context, obj));
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder sUB_SolverTest_SetSolverTestStatsBuilder(
		java.util.List<solver.proxies.SolverQuestion> _solverQuestionList,
		solver.proxies.SolverTest _solverTest
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Solver.SUB_SolverTest_SetSolverTestStats");
		builder = builder.withParam("SolverQuestionList", _solverQuestionList);
		builder = builder.withParam("SolverTest", _solverTest);
		return builder;
	}

	public static solver.proxies.SolverTest sUB_SolverTest_SetSolverTestStats(
		IContext context,
		java.util.List<solver.proxies.SolverQuestion> _solverQuestionList,
		solver.proxies.SolverTest _solverTest
	)
	{
		Object result = sUB_SolverTest_SetSolverTestStatsBuilder(
				_solverQuestionList,
				_solverTest
			)
			.execute(context);
		return result == null ? null : solver.proxies.SolverTest.initialize(context, (IMendixObject) result);
	}
}
