package basic.inheritance1;

public class Bike extends Vehicle{
	private String handle;

	public Bike() {
		handle = "Short";
	}

	

	public Bike(String engine, int wheels, int seats, int fuelTank, String lights, String handle) {
		super(engine, wheels, seats, fuelTank, lights);
		this.handle = handle;
	}



	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}
	@Override
	public String run() {
		return "Running bike";
	}

    @Override
    public String toString() {
        return "Bike [handle=" + handle + ", toString()=" + super.toString() + "]";
    }



	



	

	


}