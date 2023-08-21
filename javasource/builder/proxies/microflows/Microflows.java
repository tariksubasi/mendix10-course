// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package builder.proxies.microflows;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public final class Microflows
{
	/**
	 * Private constructor to prevent instantiation of this class. 
	 */
	private Microflows() {}

	// These are the microflows for the Builder module
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Course_DeleteBuilder(
		builder.proxies.Course _course,
		builder.proxies.School _school
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Builder.ACT_Course_Delete");
		builder = builder.withParam("Course", _course);
		builder = builder.withParam("School", _school);
		return builder;
	}

	public static void aCT_Course_Delete(
		IContext context,
		builder.proxies.Course _course,
		builder.proxies.School _school
	)
	{
		aCT_Course_DeleteBuilder(
				_course,
				_school
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Course_ShowEditBuilder(
		builder.proxies.Course _course,
		builder.proxies.School _school
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Builder.ACT_Course_ShowEdit");
		builder = builder.withParam("Course", _course);
		builder = builder.withParam("School", _school);
		return builder;
	}

	public static void aCT_Course_ShowEdit(
		IContext context,
		builder.proxies.Course _course,
		builder.proxies.School _school
	)
	{
		aCT_Course_ShowEditBuilder(
				_course,
				_school
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Lecture_DeleteBuilder(
		builder.proxies.Lecture _lecture,
		builder.proxies.Course _course
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Builder.ACT_Lecture_Delete");
		builder = builder.withParam("Lecture", _lecture);
		builder = builder.withParam("Course", _course);
		return builder;
	}

	public static void aCT_Lecture_Delete(
		IContext context,
		builder.proxies.Lecture _lecture,
		builder.proxies.Course _course
	)
	{
		aCT_Lecture_DeleteBuilder(
				_lecture,
				_course
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Lecture_ShowEditBuilder(
		builder.proxies.Lecture _lecture,
		builder.proxies.Course _course
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Builder.ACT_Lecture_ShowEdit");
		builder = builder.withParam("Lecture", _lecture);
		builder = builder.withParam("Course", _course);
		return builder;
	}

	public static void aCT_Lecture_ShowEdit(
		IContext context,
		builder.proxies.Lecture _lecture,
		builder.proxies.Course _course
	)
	{
		aCT_Lecture_ShowEditBuilder(
				_lecture,
				_course
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_SaveTestBuilder(
		builder.proxies.TestBuilderHelper _testBuilderHelper
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Builder.ACT_SaveTest");
		builder = builder.withParam("TestBuilderHelper", _testBuilderHelper);
		return builder;
	}

	public static void aCT_SaveTest(
		IContext context,
		builder.proxies.TestBuilderHelper _testBuilderHelper
	)
	{
		aCT_SaveTestBuilder(
				_testBuilderHelper
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder dS_ActiveQuestionBuilder(
		builder.proxies.TestBuilderHelper _testBuilderHelper
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Builder.DS_ActiveQuestion");
		builder = builder.withParam("TestBuilderHelper", _testBuilderHelper);
		return builder;
	}

	public static builder.proxies.Question dS_ActiveQuestion(
		IContext context,
		builder.proxies.TestBuilderHelper _testBuilderHelper
	)
	{
		Object result = dS_ActiveQuestionBuilder(
				_testBuilderHelper
			)
			.execute(context);
		return result == null ? null : builder.proxies.Question.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder dS_ConnectedSelectorBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Builder.DS_ConnectedSelector");
		return builder;
	}

	public static builder.proxies.ConnectedSelector dS_ConnectedSelector(IContext context)
	{
		Object result = dS_ConnectedSelectorBuilder().execute(context);
		return result == null ? null : builder.proxies.ConnectedSelector.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder dS_SelectableCoursesBuilder(
		builder.proxies.ConnectedSelector _connectedSelector
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Builder.DS_SelectableCourses");
		builder = builder.withParam("ConnectedSelector", _connectedSelector);
		return builder;
	}

	public static java.util.List<builder.proxies.Course> dS_SelectableCourses(
		IContext context,
		builder.proxies.ConnectedSelector _connectedSelector
	)
	{
		Object result = dS_SelectableCoursesBuilder(
				_connectedSelector
			)
			.execute(context);
		return result == null ? null : com.mendix.utils.ListUtils.map((java.util.List<IMendixObject>) result, obj -> builder.proxies.Course.initialize(context, obj));
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder dS_SelectableLecturesBuilder(
		builder.proxies.ConnectedSelector _connectedSelector
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Builder.DS_SelectableLectures");
		builder = builder.withParam("ConnectedSelector", _connectedSelector);
		return builder;
	}

	public static java.util.List<builder.proxies.Lecture> dS_SelectableLectures(
		IContext context,
		builder.proxies.ConnectedSelector _connectedSelector
	)
	{
		Object result = dS_SelectableLecturesBuilder(
				_connectedSelector
			)
			.execute(context);
		return result == null ? null : com.mendix.utils.ListUtils.map((java.util.List<IMendixObject>) result, obj -> builder.proxies.Lecture.initialize(context, obj));
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder dS_TestBuilderHelperBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Builder.DS_TestBuilderHelper");
		return builder;
	}

	public static builder.proxies.TestBuilderHelper dS_TestBuilderHelper(IContext context)
	{
		Object result = dS_TestBuilderHelperBuilder().execute(context);
		return result == null ? null : builder.proxies.TestBuilderHelper.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder sUB_CreateTestBuilder(
		builder.proxies.TestBuilderHelper _testBuilderHelper
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Builder.SUB_CreateTest");
		builder = builder.withParam("TestBuilderHelper", _testBuilderHelper);
		return builder;
	}

	public static void sUB_CreateTest(
		IContext context,
		builder.proxies.TestBuilderHelper _testBuilderHelper
	)
	{
		sUB_CreateTestBuilder(
				_testBuilderHelper
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder sUB_ValidateTestBuilder(
		builder.proxies.TestBuilderHelper _testBuilderHelper
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("Builder.SUB_ValidateTest");
		builder = builder.withParam("TestBuilderHelper", _testBuilderHelper);
		return builder;
	}

	public static boolean sUB_ValidateTest(
		IContext context,
		builder.proxies.TestBuilderHelper _testBuilderHelper
	)
	{
		Object result = sUB_ValidateTestBuilder(
				_testBuilderHelper
			)
			.execute(context);
		return (boolean) result;
	}
}
