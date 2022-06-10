package stepDefinations;

import com.hcl.Insurance;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepsInsurance {
	
	Insurance insurance = new Insurance();
	
	@Given("^Customer \"([^\"]*)\" signs up$")
	public void customer_signs_up(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		insurance.setCustomerName(arg1);
	}

	@When("^If customer age (\\d+) is greater than (\\d+), apply discount (\\d+)$")
	public void if_customer_age_is_greater_than_apply_discount(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.ageDiscount(arg1, arg2, arg3);
	}

	@When("^If customer has no crashes \"([^\"]*)\", apply discount (\\d+)$")
	public void if_customer_has_no_crashes_apply_discount(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.noCrashDiscount(arg1, arg2);
	}

	@When("^If customers credit score (\\d+) is greater than (\\d+), apply discount (\\d+)$")
	public void if_customers_credit_score_is_greater_than_apply_discount(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.creditScoreDiscount(arg1, arg2, arg3);
	}

	@When("^If customers income (\\d+) is greater than (\\d+), apply discount (\\d+)$")
	public void if_customers_income_is_greater_than_apply_discount(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.incomeDiscount(arg1, arg2, arg3);
	}

	@When("^If customer is military \"([^\"]*)\", apply discount (\\d+)$")
	public void if_customer_is_military_apply_discount(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.militaryDiscount(arg1, arg2);
		
	}

	@When("^If customer is a student \"([^\"]*)\", apply discount (\\d+)$")
	public void if_customer_is_a_student_apply_discount(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.studentDiscount(arg1, arg2);
	}

	@When("^If customers vehicle is parked in a garage \"([^\"]*)\", apply discount (\\d+)$")
	public void if_customers_vehicle_is_parked_in_a_garage_apply_discount(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.parkedGarageDiscount(arg1, arg2);
	}

	@When("^If customers account tenure (\\d+) is greater than (\\d+) year, apply discount (\\d+)$")
	public void if_customers_account_tenure_is_greater_than_year_apply_discount(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.accountTenureDiscount(arg1, arg2, arg3);
	}

	@When("^If customers safety feature count (\\d+) is greater than (\\d+), apply discount (\\d+)$")
	public void if_customers_safety_feature_count_is_greater_than_apply_discount(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		insurance.safetyDiscount(arg1, arg2, arg3);
	}

	@When("^If customer signed up for payment autodraft \"([^\"]*)\", apply discount (\\d+)$")
	public void if_customer_signed_up_for_payment_autodraft_apply_discount(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.autoDraftDiscount(arg1, arg2);
	}

	@When("^If customer bundles additional policies \"([^\"]*)\", apply discount (\\d+)$")
	public void if_customer_bundles_additional_policies_apply_discount(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.bundleDiscount(arg1, arg2);
	}

	@When("^If customers yearly mileage (\\d+) is less than (\\d+) miles per year, apply discount (\\d+)$")
	public void if_customers_yearly_mileage_is_less_than_miles_per_year_apply_discount(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.yearlyMileageDiscount(arg1, arg2, arg3);
	}

	@When("^If customer does not have a lien \"([^\"]*)\" on the vehicle, apply discount (\\d+)$")
	public void if_customer_does_not_have_a_lien_on_the_vehicle_apply_discount(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.lienDiscount(arg1, arg2);
		
	}

	@When("^If customers total vehicle mileage (\\d+) is less than (\\d+) miles, apply discount (\\d+)$")
	public void if_customers_total_vehicle_mileage_is_less_than_miles_apply_discount(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.MileageDiscount(arg1, arg2, arg3);
	}

	@When("^If customers vehicle is electric \"([^\"]*)\", apply discount (\\d+)$")
	public void if_customers_vehicle_is_electric_apply_discount(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.electricCarDiscount(arg1, arg2);
	}

	@Then("^Display total discount$")
	public void display_total_discount() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		insurance.getTotalDiscount();
	}

}
