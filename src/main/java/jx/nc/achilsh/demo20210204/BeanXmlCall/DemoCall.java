package jx.nc.achilsh.demo20210204.BeanXmlCall;

import jx.nc.achilsh.demo20210204.BeanXml.OneDemo;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;

@Slf4j
@Data
public class DemoCall {
    private OneDemo oneDeo;
    private int xx;

    public DemoCall(OneDemo de, int yy) { //设置引用和字面量
        this.oneDeo = de;
        this.xx =yy;
    }

    public DemoCall( Set <OneDemo> sDeo,int yy ) { //设置set和字面量
        this.xx = yy;
    }

    public DemoCall () {

    }

    ///////
    public void display() {
        oneDeo.play ();
        log.info("====== test.....");
        return ;
    }
    public void arrDisplay() {
        log.info(">>>>>> " + this.xx);
    }
    public void setDisplay() {
        log.info("----++++++");
    }

}
