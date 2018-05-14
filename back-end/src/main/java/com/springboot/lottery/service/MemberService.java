package com.springboot.lottery.service;

import java.util.List;
import java.util.Map;

import com.springboot.lottery.dto.SingleNoteDTO;
import com.springboot.lottery.entity.Member;
import com.springboot.lottery.entity.MemberFundRecord;
import com.springboot.lottery.entity.MemberSingleNote;
import com.springboot.lottery.util.Page;

public interface MemberService {

	/**
	 * 会员开户
	 * 
	 * @param member
	 */
	int addMember(Member member);

	/**
	 * 会员登录
	 * 
	 * @param map
	 * @return
	 */
	List<Member> loginMember(Map<String, Object> map);

	/**
	 * 会员下注
	 * 
	 * @param memberSingleNote
	 * @return
	 */
	int betMember(MemberSingleNote memberSingleNote);

	/**
	 * 根据会员id查询余额
	 * 
	 * @param mid
	 * @return
	 */
	Member getMemberByMoney(String mid);

	/**
	 * 根据mid修改余额
	 * 
	 * @param map
	 */
	int updateSum(Map<String, String> map);

	/**
	 * 根据snid删除注单
	 * 
	 * @param string
	 * @return
	 */
	int deleteSingleNote(String snid);

	/**
	 * 注单结算
	 * 
	 * @param map
	 * @return
	 */
	int singleNoteAccount(Map<String, String> map);

	/**
	 * 查询注单DTO
	 * 
	 * @param map
	 * @return
	 */
	List<SingleNoteDTO> querySingleNoteDTO(Map<String, String> map);

	/**
	 * 在线存款与在线取款
	 * 
	 * @param memberFundRecord
	 * @return
	 */
	int addFundRecord(MemberFundRecord memberFundRecord);

	/**
	 * 根据资金流水表id删除信息
	 * 
	 * @param frid
	 * @return
	 */
	int deleteFundRecord(String frid);

	/**
	 * 查询资金流水记录
	 * 
	 * @param map
	 * @return
	 */
	Page<Map<String, Object>> listFundRecord(Map<String, Object> map);
}
