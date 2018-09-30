package com.apple.mop.test;

import java.io.InputStream;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.io.IOUtils;

import com.apple.mop.core.model.ds.DSPerson;
import com.apple.mop.core.util.CipherUtil;
import com.apple.mop.core.util.JsonUtil;
import com.apple.mop.core.util.MOPSecurityUtil;

public class GetPersonToken {

	public static void main(String[] args) throws Exception {
		InputStream inputStream = GetPersonToken.class.getClassLoader()
				.getResourceAsStream("jwtToken.txt");
		String str = IOUtils.toString(inputStream);
		DSPerson dsPerson = CipherUtil.getDSPersonFromEncodedString(str);
		System.out.println(dsPerson);
		System.out.println(dsPerson.getPersonTypeCode());
		System.out.println(dsPerson.getProducts());
		System.out.println(dsPerson.getSite().getIncludedSites().size());
		System.out.println(dsPerson.getExcludeHSDAttributeMap().size());
		System.out.println(dsPerson.getExcludeHSDAttributeMap());
		System.out
				.println(JsonUtil.convertObjectToJson(dsPerson.getUserInfo()));
		if (MapUtils.isEmpty(dsPerson.getExcludeHSDAttributeMap())) {
			System.out.println("YES");
		}
		// BufferedWriter bw = null;
		// FileWriter fw = null;
		// try {
		// fw = new FileWriter(
		// "/Users/danishmau/Desktop/temp/trust/person.json");
		// bw = new BufferedWriter(fw);
		// bw.write(JsonUtil.convertObjectToJson(dsPerson));
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		System.out.println(MOPSecurityUtil.isAuthor(dsPerson));
		System.out.println(MOPSecurityUtil.isMDMSuperAdmin(dsPerson));
		System.out.println(MOPSecurityUtil.isPublishSuperAdmin(dsPerson));
	}

}
