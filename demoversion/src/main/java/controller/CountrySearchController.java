package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.SelctedDetailsForCountry;
import dto.TemplateForSearch;

@Controller
public class CountrySearchController {

	private String resultOfCountry = null;
	private String resultOfDetails = null;
	ArrayList<SelctedDetailsForCountry> listDetails = new ArrayList<SelctedDetailsForCountry>();
	
	@RequestMapping(value="/countrysearch")
	public String selectWhatToDoNext(Model model,HttpServletRequest request){
		
		resultOfCountry = request.getParameter("countryResult");
		resultOfDetails = request.getParameter("subResult");
		
		List<TemplateForSearch> searchTemplate1 = createTemplate1ForSearch();
		model.addAttribute("template1", searchTemplate1);
		
		List<TemplateForSearch> searchTemplate2 = createTemplate2ForSearch();
		model.addAttribute("template2", searchTemplate2);
		
		
		List<SelctedDetailsForCountry> searchTemplate3 = createTemplate3ForSearch();
		model.addAttribute("template3", searchTemplate3);
		
		return "countrysearch";
	}
	
	private List<TemplateForSearch> createTemplate1ForSearch(){
		TemplateForSearch t1 = new TemplateForSearch("Which Country do you want to know?",
				Arrays.asList(  "UNITED STATES OF AMERICA",
							    "JAPAN",
								"CHINA",
								"FRANCE",
								"GREAT BRITAIN",
								"GERMANY",
								"ITALY",
								"AUSTRALLIA",
								"MEXICO",
								"CANADA",
								"REPUBLIC OF KOREA",
								"SPAIN"));
		return Arrays.asList(t1);
	}
	
	private List<SelctedDetailsForCountry> createTemplate3ForSearch(){
		ArrayList<SelctedDetailsForCountry> selectedCombination = new ArrayList<SelctedDetailsForCountry>();
		
		if(resultOfCountry != null && resultOfDetails != null){
			SelctedDetailsForCountry t3 = new SelctedDetailsForCountry(resultOfCountry,resultOfDetails);
			selectedCombination.add(t3); // ArrayList로 계속 담는다.
			return selectedCombination;
		}
		else if ((resultOfCountry == null || resultOfDetails == null)&&(selectedCombination.size()>=1) )
		{
			// 만약 아무것도 선택하지 않고 버튼을 누르면 기존에 선택했던 내용들은 다 남겨두어야 한다.
			return selectedCombination;
		}
		else
		{
			SelctedDetailsForCountry t3 = new SelctedDetailsForCountry("Nothing on the list","");
			return Arrays.asList(t3);
		}
	}
	
	/* 아래 부분을 약간 수정해서 위처럼 ArrayList에 생성되는 객체를 계속해서 담도록 한다.
	private List<SelctedDetailsForCountry> createTemplate3ForSearch(){
		if(resultOfCountry != null && resultOfDetails != null){
			SelctedDetailsForCountry t3 = new SelctedDetailsForCountry(resultOfCountry,resultOfDetails);
			return Arrays.asList(t3);
		}
		else
		{
			SelctedDetailsForCountry t3 = new SelctedDetailsForCountry("","");
			return Arrays.asList(t3);
		}
	}
	*/
	// 나라를 선택할 시에 보여질 수 있는 리스트 목록
	private List<TemplateForSearch> createTemplate2ForSearch(){
		TemplateForSearch t2 = new TemplateForSearch("About what details, do you want to know more? (multiple choice available)",
				Arrays.asList("High_technology_exports",
							  "Commercial_service_exports",
							  "Merchandise_exports",
							  "Commercial_service_import",
							  "Merchandise_imports",
							  "Mortality_rate_neonatal_per_1000",
							  "Government_expenditure_on_education_total_percnt_of_GDP",
							  "Individuals_using_the_Internet_percnt_of_population",
							  "Mobile_cellular_subscriptions_per_100_people",
							  "Rail_lines_total_route_km",
							  "Railways_passengers_carried_million_passenger_km",
							  "Railways_goods_transported_million_ton_km",
							  "Air_transport_passengers_carried",
							  "Air_transport_freight_million_ton-km",
							  "Air_transport_registered_carrier_departures_worldwide",
							  "Trademark_applications_total",
							  "Patent_applications_residents",
							  "Patent_applications_nonresidents",
							  "Fuel_imports_percnt_of_merchandise_imports",
							  "Food_imports_percnt_of_merchandise_imports",
							  "Agricultural_raw_materials_imports_percnt_of_merchandise_imports",
							  "Urban_population",
							  "Urban_population_growth_annual_percnt",
							  "Rural_population_growth_annual_percnt",
							  "Rural_population",
							  "Population_male",
							  "Population_female",
							  "Population_total",
							  "Population_growth_annual_percnt",
							  "Sex_ratio_at_birth_male_births_per_female_births",
							  "Population_ages_65_and_above_total",
							  "School_enrollment_primary_percnt_gross",
							  "Pupil-teacher_ratio_primary",
							  "Primary_education_pupils_percnt_female",
							  "Primary_education_pupils",
							  "Primary_education_duration_years",
							  "Cost_to_export_USD_per_container",
							  "Expense_percnt_of_GDP",
							  "Other_expense_percnt_of_expense",
							  "Interest_payments_percnt_of_expense",
							  "Interest_payments_percnt_of_revenue",
							  "Tax_revenue_percnt_of_GDP",
							  "Taxes_on_international_trade_percnt_of_revenue"							  
							   ));
		return Arrays.asList(t2);
	}
	
}
