package mao.after;

/**
 * Project name(项目名称)：java设计模式_合成复用原则
 * Package(包名): mao.after
 * Class(类名): Car
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/11
 * Time(创建时间)： 20:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class Car
{
    /**
     * The Color.
     */
    protected Color color;

    /**
     * Instantiates a new Car.
     *
     * @param color the color
     */
    public Car(Color color)
    {
        this.color = color;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public Color getColor()
    {
        return color;
    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(Color color)
    {
        this.color = color;
    }

    /**
     * Move.
     */
    public void move()
    {
        System.out.println(color.getColor() + "汽车移动");
    }
}
