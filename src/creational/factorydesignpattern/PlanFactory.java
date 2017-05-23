package creational.factorydesignpattern;

public class PlanFactory {
	
	public Plan getPlan(String planType){
		if(planType==null){
			return null;
		}
		if(planType.equalsIgnoreCase("Domesticplan")){
			return new DomesticPlan();
		}
		if(planType.equalsIgnoreCase("Commercialplan")){
			return new CommerciaPlan() ;
		}
		if(planType.equalsIgnoreCase("Institutionplan")){
			return new InstitutionPlan();
		}
		return null;

	}


}
