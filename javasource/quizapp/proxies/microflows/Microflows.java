// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package quizapp.proxies.microflows;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;

public final class Microflows
{
	/**
	 * Private constructor to prevent instantiation of this class. 
	 */
	private Microflows() {}

	// These are the microflows for the QuizApp module
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Test_BCOEventBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("QuizApp.ACT_Test_BCOEvent");
		return builder;
	}

	public static void aCT_Test_BCOEvent(IContext context)
	{
		aCT_Test_BCOEventBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder bCO_RemoteObjectBuilder(
		quizapp.proxies.RemoteObject _remoteObject
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("QuizApp.BCO_RemoteObject");
		builder = builder.withParam("RemoteObject", _remoteObject);
		return builder;
	}

	public static boolean bCO_RemoteObject(
		IContext context,
		quizapp.proxies.RemoteObject _remoteObject
	)
	{
		Object result = bCO_RemoteObjectBuilder(
				_remoteObject
			)
			.execute(context);
		return (boolean) result;
	}
}