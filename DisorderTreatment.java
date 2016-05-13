/*

*Trisha Martindale

*NMSU Grants - CS 187

*Final Project / Grades

*Due: May 12, 2016

*/

public class DisorderTreatment {
	
	public static void main(String[] args) {
	
// The int will be which disorder the patient has
		
		int disorder =  2;
		
// 1 is Bi-polar disorder
		
	if(disorder == 1) {
	System.out.print("Needs cognitive behavioral therapy, and prescriptions for anticonvulsion and anti-psychotic medications.");
	
// 2 is Schizophrenia disorder.
	
	}else if(disorder == 2){
	System.out.print("Needs cognitive therapy, rehabilitation, family therapy, behavioral therapy, group psychotherapy, and prescriptions for anti-psychotic and anti-tremor medications.");
	
// 3 is Dissociative identity disorder.
	
	}else if(disorder == 3){
		System.out.print("Needs family therapy, psychotherapy, and cognitive behavioral therapy.");
		
// 4 is Obsessive compulsive disorder.				
	
	}else if(disorder == 4){
		System.out.print("Needs a support group, cognitive behavioral therapy, aversion therapy, rational emotive behavior therapy, exposure and response prevention, psychotherapy, systematic desensitization, group therapy, and prescriptions for anti-depressants and anxiolytic medications.");	
	
// 5 is anxiety disorder
		
	}else if(disorder == 5){
		System.out.print("Needs psychotherapy, cognitive behavioral therapy meditation, and prescriptions for antidepressants, sedatives, anxiolytics, and nerve pain medications.");
     
// If the patient shows that they no longer require therapy or medications, then the int will not match any of the disorders.
	
	}else {
	System.out.print("Nothing needs to be done because there is nothing wrong with the patient.");

	}
}
}
// This is a completed project for CS187