package com.springboot.lottery.mybatis;

import java.util.List;
import java.util.Map;

import com.springboot.lottery.dto.FundRecordDTO;
import com.springboot.lottery.dto.SingleNoteDTO;
import com.springboot.lottery.entity.Member;
import com.springboot.lottery.entity.MemberFundRecord;
import com.springboot.lottery.entity.MemberSingleNote;

/**
 * 数据访问层
 * 
 * @author Administrator
 *
 */
public interface MemberDao {
	/**
	 * 会员开户
	 * 
	 * @param member
	 */
	int addMember(Member member);

	/**
	 * 查询会员信息
	 * 
	 * @param map
	 * @return
	 */
	List<Member> queryMember(Map<String, Object> map);

	/**
	 * 会员名验证
	 * 
	 * @param name
	 * @return
	 */
	String verifyMember(String name);

	/**
	 * 会员下注
	 * 
	 * @param memberSingleNote
	 * @return
	 */
	int betMember(MemberSingleNote memberSingleNote);

	/**
	 * 根据mid修改余额
	 * 
	 * @param map
	 */
	int updateSum(Map<String, Object> map);

	/**
	 * 根据mid修改用户信息
	 * 
	 * @param map
	 */
	int updateMember(Map<String, Object> map);

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
	int singleNoteAccount(Map<String, Object> map);

	/**
	 * 查询注单DTO
	 * 
	 * @param map
	 * @return
	 */
	List<SingleNoteDTO> querySingleNoteDTO(Map<String, Object> map);

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
	 * 查询存取款记录
	 * 
	 * @param map
	 * @return
	 */
	List<FundRecordDTO> queryFundRecordDTO(Map<String, Object> map);

	/**
	 * 查询资金流水记录总条数
	 * 
	 * @return
	 */
	int loadFundRecordTotal(Map<String, Object> map);

	/**
	 * 资金流水记录状态修改
	 * 
	 * @param map
	 * @return
	 */
	int updateFundRecord(Map<String, Object> map);

	/**
	 * 查询资金流水记录
	 * 
	 * @param map
	 * @return
	 */
	List<MemberFundRecord> queryFundRecord(Map<String, Object> map);

	/**
	 * 查询注单记录
	 * 
	 * @param map
	 * @return
	 */
	List<MemberSingleNote> querySingleNote(Map<String, Object> map);

	/**
	 * 查询注单记录总条数
	 * 
	 * @return
	 */
	int loadSingleNoteTotal(Map<String, Object> map);

	/**
	 * 查询推广返利
	 * 
	 * @param map
	 * @return
	 */
	List<SingleNoteDTO> queryGeneralizeRebate(Map<String, Object> map);

	/**
	 * 查询推广返利总条数
	 * 
	 * @param map
	 * @return
	 */
	int queryGeneralizeRebateTotal(Map<String, Object> map);
}
