package jx.nc.achilsh.demo20210204.BeanXml;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Data
public class OneDemo {
    private int x;
    private String y;
    private double z;

    public OneDemo(int xx, String yy) { //设置字面量
        this.x = xx;
        this.y = yy;
    }
    public OneDemo(int xx, List <String> arrData) { //设置 List
        this.x = xx;
    }
    public void play() {
       log.info("data: " + this.x + ", " +  this.y);
       return ;
    }
    public void dplay() {
        log.info("setter...." + this.z);
    }
}
