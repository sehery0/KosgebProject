import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.concretes.Applicant;
import entities.concretes.Application;
import entities.concretes.Authority;
import entities.concretes.Bank;
import entities.concretes.BankUser;
import entities.concretes.BlackList;
import entities.concretes.Corporate;
import entities.concretes.Credit;
import entities.concretes.CreditFeature;
import entities.concretes.Employee;
import entities.concretes.Entrepreneur;
import entities.concretes.Feature;
import entities.concretes.UserAuthority;

public class Main {

	public static void main(String[] args) {
		//Applicant applicant = new Applicant(1,"oracle","123abc","oracle@gmail.com",1,"");
        List<CreditFeature> creditFeatures = new ArrayList<>();
        Feature feature = new Feature(1, "Destek Oranı");
        Feature feature1 = new Feature(1, "Üst Limit", "100000");
        Credit credit = new Credit(1,"Erzurum Kredisi", LocalDate.parse("2022-10-10"), LocalDate.parse("2023-10-12"), creditFeatures);
        CreditFeature creditFeature = new CreditFeature(1,feature,credit);
        CreditFeature creditFeature1 = new CreditFeature(1,feature1,credit);
        creditFeatures.add(creditFeature);
        creditFeatures.add(creditFeature1);
        Employee employee = new Employee(1,"seheryalcin","12345","seher@gmail.com",1,"Seher","Yalçın","Banka Müdürü");
        Applicant corporate = new Corporate(1,"Oracle","123","oracle@gmail.com",1,"123abc",1,"Oracle","123abc","Orta");
        Applicant entrepreneur = new Entrepreneur(1,"shrylcn","123abc","feride@gmail.com",1,"123abc",1,"Seher","Yalçın","31325154244");
        Application application = new Application(1,"Onay bekliyor",corporate,credit);
        Bank bank = new Bank(1,"Ziraat");
        BankUser bankUser = new BankUser(1,bank,entrepreneur);
        BlackList blackList = new BlackList(1,corporate);
        Authority authority = new Authority(1,"Kredi basvurusunu sorgulamak");
        UserAuthority userAuthority = new UserAuthority(1,authority,entrepreneur);

        System.out.println(credit.getCreditName());
        //System.out.println(credit.getCreditFeatures().get(0).getFeature().getFeatureName());
        //System.out.println(credit.getCreditFeatures().get(1).getFeature().getFeatureName());
        for(CreditFeature creditFeature2 :credit.getCreditFeatures()) {
            System.out.println(creditFeature2.getFeature().getFeatureName());
            System.out.println(creditFeature2.getFeature().getFeatureValue());
        }

        System.out.println(employee.getUserName());
        System.out.println(((Corporate)corporate).getCompanyName()); //unboxing
        System.out.println(((Entrepreneur)entrepreneur).getEntrepreneurId());
        System.out.println(application.getCredit().getCreditName());
        System.out.println(feature.getFeatureId());
        System.out.println(creditFeature.getCredit().getDueDate());
        System.out.println(bank.getBankName());
        System.out.println(bankUser.getUser().getUserName());
        System.out.println(blackList.getApplicant().getEmail());
        System.out.println(authority.getAuthorityName());
        System.out.println(userAuthority.getUserAuthorityId());

	}

}
