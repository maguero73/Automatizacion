package reliContribuyente;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runners.AllTests;
import org.junit.runner.Result;
import org.junit.Test;

public class testRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result result = JUnitCore.runClasses(Declaracion_de_Contratos.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
	}

  }
	
}	
