package com.springboot.lottery.service;

import java.util.List;
import java.util.Map;

import com.springboot.lottery.dto.DiceDrawDTO;
import com.springboot.lottery.entity.DiceBet;
import com.springboot.lottery.entity.DiceDraw;

public interface DiceService {

	List<DiceDraw> queryDiceDraw(Map<String, Object> map);
	
	List<DiceBet> queryDiceBet(Map<String, Object> map);
	
	Map<Integer, Map<String, Object>> queryDiceDrawResult(Map<String, Object> map);
	
	void genereateNewDiceDraw(DiceDraw current, int result, double win);
	
	int addDiceBet(DiceBet diceBet,String mid);
	
	void rewardMember(DiceDraw current, int result, DiceBet db);
	
	List<DiceDrawDTO> queryDiceDrawWithBetDTO(Map<String, Object> map);
	Integer queryDiceDrawWithBetDTOTotal(Map<String, Object> map);
	
	
	
	
	List<DiceDrawDTO> queryDiceDrawBetDTO(Map<String, Object> map);
	
	int queryDiceDrawBetTotal(Map<String, Object> map);
}
