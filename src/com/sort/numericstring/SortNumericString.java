package com.sort.numericstring;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author jang
 *
 */
public class SortNumericString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] numericString = { "10_34", "7_10", "6_45", "5_34", "4_98", "9_47", "8_34", "0_49" };
		List<String> list = Arrays.asList(numericString);
		//natural sorting
		Collections.sort(list);

		System.out.println("before comparator : " + list);
	
		//Customized sorting
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				
				String[] fromToArr = s1.split("_");
				String[] fromToArr2 = s2.split("_");

				Integer val1 = Integer.parseInt(fromToArr[0]);
				Integer val2 = Integer.parseInt(fromToArr2[0]);
				return val1.compareTo(val2);
			}
		});
		
		System.out.println("after comparator : " + list);
	}

	/**
	*
	*		public Map<String,DynaBean> getUniqueAgeBandMap(String currentClassCode) throws SWTEException { // d10
			Filter fl = new Filter();
			fl.setOrderBy(SmeAgePremiumBean.AGE_FROM);
			fl.setSort(SortType.ASCENDING);
			
			
			Criteria classCode = new Criteria(SmeAgePremiumBean.CLASS_CODE, CriteriaType.EqualsTo, currentClassCode.toString());
			fl.addCriteria(classCode);
			
			List<DynaBean> allAgePremData = quotationDAO.load(SmeAgePremiumBean.class.getName(), fl, false);
			Map<String,DynaBean> ageBandMap = new TreeMap<String, DynaBean>(new Comparator<String>() {

				@Override
				public int compare(String s1, String s2) {
					String[] fromToArr = s1.split("_");
					String[] fromToArr2 = s2.split("_");

					Integer val1 = Integer.parseInt(fromToArr[0]);
					Integer val2 = Integer.parseInt(fromToArr2[0]);
					return val1.compareTo(val2);
				}
			});
			
			for(DynaBean tempAgeBandBean : allAgePremData){
				Object ageFrom = tempAgeBandBean.getPropertyValue(SmeAgePremiumBean.AGE_FROM);
				Object ageTo = tempAgeBandBean.getPropertyValue(SmeAgePremiumBean.AGE_TO);
				String ageKey = CommonUtil.getCleanData(ageFrom)+"_"+CommonUtil.getCleanData(ageTo);
				ageBandMap.put(ageKey, tempAgeBandBean);
			}
			return ageBandMap;
		}

	*/
}
