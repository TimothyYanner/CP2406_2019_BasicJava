package week8;

public class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner(String bt)
   {
      super(bt);
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void setPower()
   {
      super.power = "four engines";
   }
}
