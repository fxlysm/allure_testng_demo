//package Listener;
//
//import java.io.File;
//
//import org.testng.IHookCallBack;
//import org.testng.IHookable;
//import org.testng.ITestResult;
//
//import ru.yandex.qatools.allure.annotations.Attachment;
//
//public class AllureReporterListener implements IHookable{
//
//    @Override
//    public void run(IHookCallBack callBack, ITestResult testResult) {
//        callBack.runTestMethod(testResult);
//        if (testResult.getThrowable() != null) {
//            try {
//                takeScreenShot(testResult.getMethod().getMethodName());
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    } 
//
//    @Attachment(value = "Failure in method {0}", type = "image/png") 
//    private byte[] takeScreenShot(String methodName) throws Exception{
//        File screenshot = Screenshots.getLastScreenshot();
//        return Files.toByteArray(screenshot);
//    }
//}
//
//
