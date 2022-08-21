package hello.aop.order.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    // hello.aop.order 패키지 및 하위 클래스
    @Pointcut("execution(* hello.aop.order..*(..))") // 포인트 컷
    public void allOrder() {} // 포인트컷 시그니처


    // 클래스 이름 패턴 * service 인 경우
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {}


    // allOrder() && allService()
    @Pointcut("allOrder() && allService()")
    public void orderAndService() {}
}
