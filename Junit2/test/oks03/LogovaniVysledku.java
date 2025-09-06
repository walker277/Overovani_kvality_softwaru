package oks03;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;

public class LogovaniVysledku implements TestExecutionListener {
    @Override
    public void executionStarted(TestIdentifier testIdentifier) {
        if (testIdentifier.isTest() == true) {
            Kontrola_Prj_03.logger.info(testIdentifier.getDisplayName());
        }
    }

    @Override
    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        if (testIdentifier. isTest() == true) {
            switch (testExecutionResult.getStatus()) {
                case SUCCESSFUL:
                   // System.err.println();
                    break;
                case FAILED:
                    Kontrola_Prj_03.logger.error(testExecutionResult.getThrowable().get().getMessage());
                   // System.err.println("\n FAILED: "
                       //     + testExecutionResult.getThrowable().get().getMessage());
                    break;
                case ABORTED:
                   // System.err.println(testExecutionResult.getThrowable().get().getMessage());
                    break;
            }
        }
    }
}
