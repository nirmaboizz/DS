package CalculatorApp;

/**
* CalculatorApp/DivideByZeroHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculator.idl
* Sunday, May 21, 2023 5:20:11 PM IST
*/

public final class DivideByZeroHolder implements org.omg.CORBA.portable.Streamable
{
  public CalculatorApp.DivideByZero value = null;

  public DivideByZeroHolder ()
  {
  }

  public DivideByZeroHolder (CalculatorApp.DivideByZero initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CalculatorApp.DivideByZeroHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CalculatorApp.DivideByZeroHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CalculatorApp.DivideByZeroHelper.type ();
  }

}