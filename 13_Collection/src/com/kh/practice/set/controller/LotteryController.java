package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;
import com.kh.practice.set.view.LotteryMenu;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();

	public boolean insertObject(Lottery l) {
		if(lottery.contains(l)) {
			return true;
		}
		else {
			lottery.add(l);
			return false;
		}
	}
	
	public boolean deleteObject(Lottery l) {
		
		boolean result = lottery.remove(l);
		
		if(lottery.contains(l) && win != null) {
			
			win.remove(l);
			return true;
		}
		return result;
	}
	
	public HashSet<Lottery> winObject() {
		if(lottery.size()<4) {
			System.out.println("추첨자 수 부족");
			new LotteryMenu().mainMenu();
		}
		ArrayList<Lottery> random = new ArrayList<Lottery>(lottery);
		
		for (;;) {
			if(win.size()==4) {
				break;
			}
			int rnum =(int)( Math.random()*lottery.size());
				if(random.get(rnum)==null && !(random.contains(random))) {
					continue;
				}
				else {
					win.add(random.get(rnum));
				}
			}
		return win;
	}
	
	public TreeSet<Lottery> sortedWinObject() {
		
		winObject();
		
		TreeSet<Lottery> sortArr =  new TreeSet<>(new SortedLottery());
		sortArr.addAll(win);
		
		
		
		return sortArr;
		
	}
	
	public boolean searchWinner(Lottery l) {
		
	}
	
	

}
