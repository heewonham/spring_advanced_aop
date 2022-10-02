package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CallServiceV0 {

    /*
    * proxy -> 실제 객체에서 external 호출 -> 실제 내부에서 internal을 부르기 때문에
    * internal은 aop가 찍히지 않는다.
    * */
    public void external() {
        log.info("call external");
        internal();
    }

    public void internal() {
        log.info("call internal");
    }
}
