/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi;

/**
 *
 * @author pb41483
 */
public class CalculatorForm
{
    private Integer a,b,c;
    private String znak;


    public Integer getA() 
    {
        return a;
    }
    
 public Integer getB() 
    {
        return b;
    }
 
 public String getZnak() 
    {
        return znak;
    }

   public Integer getC() 
    {
        return c;
    }
 
 
 
    public void setA(Integer a)
    {
        this.a = a;
    }

   public void setC(Integer c)
    {
        this.c = c;
    }


    public void setB(Integer b) 
    {
        this.b = b;
    }


 

    public void setZnak(String znak) 
    {
        this.znak = znak;
    }

}