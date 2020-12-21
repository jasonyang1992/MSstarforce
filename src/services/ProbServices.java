package services;

import probability.Probability;
import starforce.SFItem;

public class ProbServices {

	private SFItem sfi = new SFItem();
	private Probability prob = new Probability();
	private String placeHolder;
	
	public void startStarForce() {
		do {
			prob.clearBag();
			switch (sfi.getCurrentStar()) {
			case 0:
				prob.addProb(95, 5); // 95% Success
				System.out.println(checkSuccessFail10());
				break;
			case 1:
				prob.addProb(90, 10); // 90% Success
				System.out.println(checkSuccessFail10());
				break;
			case 2:
				prob.addProb(85, 15); // 85% Success
				System.out.println(checkSuccessFail10());
				break;
			case 3:
				prob.addProb(80, 20); // 80% Success
				System.out.println(checkSuccessFail10());
				break;
			case 4:
				prob.addProb(75, 25); // 75% Success
				System.out.println(checkSuccessFail10());
				break;
			case 5:
				prob.addProb(70, 30); // 70% Success
				System.out.println(checkSuccessFail10());
				break;
			case 6:
				prob.addProb(65, 35); // 65% Success
				System.out.println(checkSuccessFail10());
				break;
			case 7:
				prob.addProb(60, 40); // 60% Success
				System.out.println(checkSuccessFail10());
				break;
			case 8:
				prob.addProb(55, 45); // 55% Success
				System.out.println(checkSuccessFail10());
				break;
			case 9:
				prob.addProb(50, 50); // 50% Success
				System.out.println(checkSuccessFail10());
				break;
			case 10:
				prob.addProb(45, 65); // 45% Success
				System.out.println(checkSuccessFail10());
				break;
			case 11:
				prob.addProb(40, 60); // 40% Success
				System.out.println(checkSuccessFail11());
				break;
			case 12:
				prob.addProb(4000, 5940, 60); // 40% Success
				System.out.println(checkSuccessFailDest());
				break;
			case 13:
				prob.addProb(3500, 6370, 130); // 35% Success
				System.out.println(checkSuccessFailDest());
				break;
			case 14:
				prob.addProb(3000, 6860, 140); // 30% Success
				System.out.println(checkSuccessFailDest());
				break;
			case 15:
				prob.addProb(3000, 6790, 210); // 30% Success
				System.out.println(checkSuccessFailDest15());
				break;
			case 16:
				prob.addProb(3000, 6790, 210); // 30% Success
				System.out.println(checkSuccessFailDest());
				break;
			case 17:
				prob.addProb(3000, 6790, 210); // 30% Success
				System.out.println(checkSuccessFailDest());
				break;
			case 18:
				prob.addProb(3000, 6720, 280); // 30% Success
				System.out.println(checkSuccessFailDest());
				break;
			case 19:
				prob.addProb(3000, 6720, 280); // 30% Success
				System.out.println(checkSuccessFailDest());
				break;
			case 20:
				prob.addProb(3000, 6300, 700); // 30% Success
				System.out.println(checkSuccessFailDest20());
				break;
			case 21:
				prob.addProb(3000, 6300, 700); // 30% Success
				System.out.println(checkSuccessFailDest());
				break;
			case 22:
				prob.addProb(300, 7760, 1940); // 3% Success
				System.out.println(checkSuccessFailDest());
				break;
			case 23:
				prob.addProb(200, 6860, 2940); // 2% Success
				System.out.println(checkSuccessFailDest());
				break;
			case 24:
				prob.addProb(100, 5940, 3940); // 1% Success
				System.out.println(checkSuccessFailDest());
				break;
			default:
				 break;
			}
		} while (sfi.getCurrentStar() < 23);
		
		System.out.println("Success times: " +sfi.getSuccess() +", Fail times: " +sfi.getFail() +", Destroyed times: " +sfi.getdestroyRate());
	}
	
	private String checkSuccessFail10() {
		placeHolder = prob.getProb();
		if(placeHolder == "Success") {
			sfi.addStar();
			sfi.addSuccess();
			return "Success! Current Star force is " +sfi.getCurrentStar();
		}
		else {
			sfi.addFail();
			return "Failed. Current Star force is " +sfi.getCurrentStar();
		}
	}
	
	private String checkSuccessFail11() {
		placeHolder = prob.getProb();
		if(placeHolder == "Success") {
			sfi.addStar();
			sfi.addSuccess();
			return "Success! Current Star force is " +sfi.getCurrentStar();
		}
		else {
			sfi.addFail();
			sfi.subStar();
			return "Failed. Current Star force is " +sfi.getCurrentStar();
		}
	}
	
	private String checkSuccessFailDest15() {
		placeHolder = prob.getProb();
		if(placeHolder == "Success") {
			sfi.addStar();
			sfi.addSuccess();
			return "Success! Current Star force is " +sfi.getCurrentStar();
		}
		else if(placeHolder == "Destroyed") {
			sfi.destroyed();
			sfi.addDestroyRate();
			return "Item has been destroyed";
		}
		else {
			sfi.setCurrentStar(15);
			sfi.addFail();
			return "Failed. Current Star force is " +sfi.getCurrentStar();
		}
	}
	
	private String checkSuccessFailDest20() {
		placeHolder = prob.getProb();
		if(placeHolder == "Success") {
			sfi.addStar();
			sfi.addSuccess();
			return "Success! Current Star force is " +sfi.getCurrentStar();
		}
		else if(placeHolder == "Destroyed") {
			sfi.destroyed();
			sfi.addDestroyRate();
			return "Item has been destroyed";
		}
		else {
			sfi.setCurrentStar(20);
			sfi.addFail();
			return "Failed. Current Star force is " +sfi.getCurrentStar();
		}
	}
	
	private String checkSuccessFailDest() {
		placeHolder = prob.getProb();
		if(placeHolder == "Success") {
			sfi.addStar();
			sfi.addSuccess();
			return "Success! Current Star force is " +sfi.getCurrentStar();
		}
		else if(placeHolder == "Destroyed") {
			sfi.destroyed();
			sfi.addDestroyRate();
			return "Item has been destroyed";
		}
		else {
			sfi.subStar();
			sfi.addFail();
			return "Failed. Current Star force is " +sfi.getCurrentStar();
		}
	}
}
