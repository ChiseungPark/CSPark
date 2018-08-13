package dto;

public class CountryDataRequest {
	
	// DataBase의 형식과 정확하게 일치하게 만들어야 데이터를 가져올 수 있다.
	//1~10
	private String year = null;
	private String High_technology_exports = null;
	private String Commercial_service_exports = null;
	private String Merchandise_exports = null;
	private String Commercial_service_import = null;
	private String Merchandise_imports = null;
	private String Mortality_rate_neonatal_per_1000 = null;
	private String Government_expenditure_on_education_total_percnt_of_GDP = null;
	private String Individuals_using_the_Internet_percnt_of_population = null;
	private String Mobile_cellular_subscriptions_per_100_people = null;
	
	//11~20
	private String Rail_lines_total_route_km = null;
	private String Railways_passengers_carried_million_passenger_km = null;
	private String Railways_goods_transported_million_ton_km = null;
	private String Air_transport_passengers_carried = null;
	private String Air_transport_freight_million_ton_km = null;
	private String Air_transport_registered_carrier_departures_worldwide = null;
	private String Trademark_applications_total = null;
	private String Patent_applications_residents = null;
	private String Patent_applications_nonresidents = null;
	private String Fuel_imports_percnt_of_merchandise_imports = null;
	
	//21~30
	private String Food_imports_percnt_of_merchandise_imports = null;
	private String Agricultural_raw_materials_imports_percnt_of_merchandise_imports = null;
	private String Urban_population = null;
	private String Urban_population_growth_annual_percnt = null;
	private String Rural_population_growth_annual_percnt = null;
	private String Rural_population = null;
	private String Population_male = null;
	private String Population_female = null;
	private String Population_total = null;
	private String Population_growth_annual_percnt = null;
	
	//31~40
	private String Sex_ratio_at_birth_male_births_per_female_births = null;
	private String Population_ages_65_and_above_total = null;
	private String School_enrollment_primary_percnt_gross = null;
	private String Pupil_teacher_ratio_primary = null;
	private String Primary_education_pupils_percnt_female = null;
	private String Primary_education_pupils = null;
	private String Primary_education_duration_years = null;
	private String Cost_to_export_USD_per_container = null;
	private String Expense_percnt_of_GDP = null;
	private String Other_expense_percnt_of_expense = null;
	
	//41~44
	private String Interest_payments_percnt_of_expense = null;
	private String Interest_payments_percnt_of_revenue = null;
	private String Tax_revenue_percnt_of_GDP = null;
	private String Taxes_on_international_trade_percnt_of_revenue = null;
	
	//생성자부분
	public CountryDataRequest(String input1,String input2,String input3,String input4,String input5,String input6,
								String input7,String input8,String input9,String input10,String input11,String input12,
								String input13,String input14,String input15,String input16,String input17,String input18,
								String input19,String input20,String input21,String input22,String input23,String input24,
								String input25,String input26,String input27,String input28,String input29,String input30,
								String input31,String input32,String input33,String input34,String input35,String input36,
								String input37,String input38,String input39,String input40,String input41,String input42,
								String input43,String input44)
	{
		//1~10
		this.year = input1;
		this.High_technology_exports = input2;
		this.Commercial_service_exports = input3;
		this.Merchandise_exports = input4;
		this.Commercial_service_import = input5;
		this.Merchandise_imports = input6;
		this.Mortality_rate_neonatal_per_1000 = input7;
		this.Government_expenditure_on_education_total_percnt_of_GDP = input8;
		this.Individuals_using_the_Internet_percnt_of_population = input9;
		this.Mobile_cellular_subscriptions_per_100_people = input10;
		//11~20
		this.Rail_lines_total_route_km = input11;
		this.Railways_passengers_carried_million_passenger_km = input12;
		this.Railways_goods_transported_million_ton_km = input13;
		this.Air_transport_passengers_carried = input14;
		this.Air_transport_freight_million_ton_km = input15;
		this.Air_transport_registered_carrier_departures_worldwide = input16;
		this.Trademark_applications_total = input17;
		this.Patent_applications_residents = input18;
		this.Patent_applications_nonresidents = input19;
		this.Fuel_imports_percnt_of_merchandise_imports = input20;
		//21~30
		this.Food_imports_percnt_of_merchandise_imports = input21;
		this.Agricultural_raw_materials_imports_percnt_of_merchandise_imports = input22;
		this.Urban_population = input23;
		this.Urban_population_growth_annual_percnt = input24;
		this.Rural_population_growth_annual_percnt = input25;
		this.Rural_population = input26;
		this.Population_male = input27;
		this.Population_female = input28;
		this.Population_total = input29;
		this.Population_growth_annual_percnt = input30;
		//31~40
		this.Sex_ratio_at_birth_male_births_per_female_births = input31;
		this.Population_ages_65_and_above_total = input32;
		this.School_enrollment_primary_percnt_gross = input33;
		this.Pupil_teacher_ratio_primary = input34;
		this.Primary_education_pupils_percnt_female = input35;
		this.Primary_education_pupils = input36;
		this.Primary_education_duration_years = input37;
		this.Cost_to_export_USD_per_container = input38;
		this.Expense_percnt_of_GDP = input39;
		this.Other_expense_percnt_of_expense = input40;
		//41~44
		this.Interest_payments_percnt_of_expense = input41;
		this.Interest_payments_percnt_of_revenue = input42;
		this.Tax_revenue_percnt_of_GDP = input43;
		this.Taxes_on_international_trade_percnt_of_revenue = input44;
		
	}
	// getter , setter 함수
	///////////////////////////////////////////////////////////////////////////////////////////////////
	//1
	public String getYear(){
		return year;
	}
	public void setYear(String input){
		this.year = input;
	}
	//2
	public String getHigh_technology_exports(){
		return High_technology_exports;
	}
	public void setHigh_technology_exports(String input){
		this.High_technology_exports = input;
	}
	//3
	public String getCommercial_service_exports(){
		return Commercial_service_exports;
	}
	public void setCommercial_service_exports(String input){
		this.Commercial_service_exports = input;
	}
	//4
	public String getMerchandise_exports(){
		return Merchandise_exports;
	}
	public void setMerchandise_exports(String input){
		this.Merchandise_exports = input;
	}
	//5
	public String getCommercial_service_import(){
		return Commercial_service_import;
	}
	public void setCommercial_service_import(String input){
		this.Commercial_service_import = input;
	}
	//6
	public String getMerchandise_imports(){
		return Merchandise_imports;
	}
	public void setMerchandise_imports(String input){
		this.Merchandise_imports = input;
	}
	//7
	public String getMortality_rate_neonatal_per_1000(){
		return Mortality_rate_neonatal_per_1000;
	}
	public void setMortality_rate_neonatal_per_1000(String input){
		this.Mortality_rate_neonatal_per_1000 = input;
	}
	//8
	public String getGovernment_expenditure_on_education_total_percnt_of_GDP()
	{
		return Government_expenditure_on_education_total_percnt_of_GDP;
	}
	public void setGovernment_expenditure_on_education_total_percnt_of_GDP(String input){
		this.Government_expenditure_on_education_total_percnt_of_GDP = input;
	}
	//9
	public String getIndividuals_using_the_Internet_percnt_of_population(){
		return Individuals_using_the_Internet_percnt_of_population;
	}
	public void setIndividuals_using_the_Internet_percnt_of_population(String input){
		this.Individuals_using_the_Internet_percnt_of_population = input;
	}
	//10
	public String getMobile_cellular_subscriptions_per_100_people(){
		return Mobile_cellular_subscriptions_per_100_people;
	}
	public void setMobile_cellular_subscriptions_per_100_people(String input){
		this.Mobile_cellular_subscriptions_per_100_people = input;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////
	//11
	public String getRail_lines_total_route_km(){
		return Rail_lines_total_route_km;
	}
	public void setRail_lines_total_route_km(String input){
		this.Rail_lines_total_route_km = input;
	}
	//12
	public String getRailways_passengers_carried_million_passenger_km(){
		return Railways_passengers_carried_million_passenger_km;
	}
	public void setRailways_passengers_carried_million_passenger_km(String input){
		this.Railways_passengers_carried_million_passenger_km = input;
	}
	//13
	public String getRailways_goods_transported_million_ton_km(){
		return Railways_goods_transported_million_ton_km;
	}
	public void setRailways_goods_transported_million_ton_km(String input){
		this.Railways_goods_transported_million_ton_km = input;
	}
	//14
	public String getAir_transport_passengers_carried(){
		return Air_transport_passengers_carried;
	}
	public void setAir_transport_passengers_carried(String input){
		this.Air_transport_passengers_carried = input;
	}
	//15
	public String getAir_transport_freight_million_ton_km(){
		return Air_transport_freight_million_ton_km;
	}
	public void setAir_transport_freight_million_ton_km(String input){
		this.Air_transport_freight_million_ton_km = input;
	}
	//16
	public String getAir_transport_registered_carrier_departures_worldwide(){
		return Air_transport_registered_carrier_departures_worldwide;
	}
	public void setAir_transport_registered_carrier_departures_worldwide(String input){
		this.Air_transport_registered_carrier_departures_worldwide = input;
	}
	//17
	public String getTrademark_applications_total(){
		return Trademark_applications_total;
	}
	public void setTrademark_applications_total(String input){
		this.Trademark_applications_total = input;
	}
	//18
	public String getPatent_applications_residents(){
		return Patent_applications_residents;
	}
	public void setPatent_applications_residents(String input){
		this.Patent_applications_residents = input;
	}
	//19
	public String getPatent_applications_nonresidents(){
		return Patent_applications_nonresidents;
	}
	public void setPatent_applications_nonresidents(String input){
		this.Patent_applications_nonresidents = input;
	}
	//20 
	public String getFuel_imports_percnt_of_merchandise_imports(){
		return Fuel_imports_percnt_of_merchandise_imports;
	}
	public void setFuel_imports_percnt_of_merchandise_imports(String input){
		this.Fuel_imports_percnt_of_merchandise_imports = input;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////
	//21
	public String getFood_imports_percnt_of_merchandise_imports(){
		return Food_imports_percnt_of_merchandise_imports;
	}
	public void setFood_imports_percnt_of_merchandise_imports(String input){
		this.Food_imports_percnt_of_merchandise_imports = input;
	}
	//22
	public String getAgricultural_raw_materials_imports_percnt_of_merchandise_imports(){
		return Agricultural_raw_materials_imports_percnt_of_merchandise_imports;
	}
	public void setAgricultural_raw_materials_imports_percnt_of_merchandise_imports(String input){
		this.Agricultural_raw_materials_imports_percnt_of_merchandise_imports = input;
	}
	//23
	public String getUrban_population(){
		return Urban_population;
	}
	public void setUrban_population(String input){
		this.Urban_population = input;
	}
	//24
	public String getUrban_population_growth_annual_percnt(){
		return Urban_population_growth_annual_percnt;
	}
	public void setUrban_population_growth_annual_percnt(String input){
		this.Urban_population_growth_annual_percnt = input;
	}
	//25
	public String getRural_population_growth_annual_percnt(){
		return Rural_population_growth_annual_percnt;
	}
	public void setRural_population_growth_annual_percnt(String input){
		this.Rural_population_growth_annual_percnt = input;
	}
	//26
	public String getRural_population(){
		return Rural_population;
	}
	public void setRural_population(String input){
		this.Rural_population = input;
	}
	//27
	public String getPopulation_male(){
		return Population_male;
	}
	public void setPopulation_male(String input){
		this.Population_male = input;
	}
	//28
	public String getPopulation_female(){
		return Population_female;
	}
	public void setPopulation_female(String input){
		this.Population_female = input;
	}
	//29
	public String getPopulation_total(){
		return Population_total;
	}
	public void setPopulation_total(String input){
		this.Population_total = input;
	}
	//30
	public String getPopulation_growth_annual_percnt(){
		return Population_growth_annual_percnt;
	}
	public void setPopulation_growth_annual_percnt(String input){
		this.Population_growth_annual_percnt = input;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////
	//31
	public String getSex_ratio_at_birth_male_births_per_female_births(){
		return Sex_ratio_at_birth_male_births_per_female_births;
	}
	public void setSex_ratio_at_birth_male_births_per_female_births(String input){
		this.Sex_ratio_at_birth_male_births_per_female_births = input;
	}
	//32
	public String getPopulation_ages_65_and_above_total(){
		return Population_ages_65_and_above_total;
	}
	public void setPopulation_ages_65_and_above_total(String input){
		this.Population_ages_65_and_above_total = input;
	}
	//33
	public String getSchool_enrollment_primary_percnt_gross(){
		return School_enrollment_primary_percnt_gross;
	}
	public void setSchool_enrollment_primary_percnt_gross(String input){
		this.School_enrollment_primary_percnt_gross = input;
	}
	//34
	public String getPupil_teacher_ratio_primary(){
		return Pupil_teacher_ratio_primary;
	}
	public void setPupil_teacher_ratio_primary(String input){
		this.Pupil_teacher_ratio_primary = input;
	}
	//35
	public String getPrimary_education_pupils_percnt_female(){
		return Primary_education_pupils_percnt_female;
	}
	public void setPrimary_education_pupils_percnt_female(String input){
		this.Primary_education_pupils_percnt_female = input;
	}
	//36
	public String getPrimary_education_pupils(){
		return Primary_education_pupils;
	}
	public void setPrimary_education_pupils(String input){
		this.Primary_education_pupils = input;
	}
	//37
	public String getPrimary_education_duration_years(){
		return Primary_education_duration_years;
	}
	public void setPrimary_education_duration_years(String input){
		this.Primary_education_duration_years = input;
	}
	//38
	public String getCost_to_export_USD_per_container(){
		return Cost_to_export_USD_per_container;
	}
	public void setCost_to_export_USD_per_container(String input){
		this.Cost_to_export_USD_per_container = input;
	}
	//39
	public String getExpense_percnt_of_GDP(){
		return Expense_percnt_of_GDP;
	}
	public void setExpense_percnt_of_GDP(String input){
		this.Expense_percnt_of_GDP = input;
	}
	//40
	public String getOther_expense_percnt_of_expense(){
		return Other_expense_percnt_of_expense;
	}
	public void setOther_expense_percnt_of_expense(String input){
		this.Other_expense_percnt_of_expense = input;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////
	//41
	public String getInterest_payments_percnt_of_expense(){
		return Interest_payments_percnt_of_expense;
	}
	public void setInterest_payments_percnt_of_expense(String input){
		this.Interest_payments_percnt_of_expense = input;
	}
	//42
	public String getInterest_payments_percnt_of_revenue(){
		return Interest_payments_percnt_of_revenue;
	}
	public void setInterest_payments_percnt_of_revenue(String input){
		this.Interest_payments_percnt_of_revenue = input;
	}
	//43
	public String getTax_revenue_percnt_of_GDP(){
		return Tax_revenue_percnt_of_GDP;
	}
	public void setTax_revenue_percnt_of_GDP(String input){
		this.Tax_revenue_percnt_of_GDP = input;
	}
	//44
	public String getTaxes_on_international_trade_percnt_of_revenue(){
		return Taxes_on_international_trade_percnt_of_revenue;
	}
	public void setTaxes_on_international_trade_percnt_of_revenue(String input){
		this.Taxes_on_international_trade_percnt_of_revenue = input;
	}
	
}
