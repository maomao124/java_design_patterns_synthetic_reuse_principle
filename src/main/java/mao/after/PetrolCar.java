package mao.after;

/**
 * Project name(项目名称)：java设计模式_合成复用原则
 * Package(包名): mao.after
 * Class(类名): PetrolCar
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/11
 * Time(创建时间)： 20:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class PetrolCar extends Car
{

    public PetrolCar(Color color)
    {
        super(color);
    }

    @Override
    public void move()
    {
        System.out.println(color.getColor() + "汽油汽车移动");
    }
}
