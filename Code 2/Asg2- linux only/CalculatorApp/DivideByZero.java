package CalculatorApp;


/**
* CalculatorApp/DivideByZero.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculator.idl
* Sunday, May 21, 2023 5:20:11 PM IST
*/

public final class DivideByZero extends org.omg.CORBA.UserException
{
  public String message = null;

  public DivideByZero ()
  {
    super(DivideByZeroHelper.id());
  } // ctor

  public DivideByZero (String _message)
  {
    super(DivideByZeroHelper.id());
    message = _message;
  } // ctor


  public DivideByZero (String $reason, String _message)
  {
    super(DivideByZeroHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class DivideByZero
