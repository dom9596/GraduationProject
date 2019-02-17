package csz.mdm.service;

import com.hand.hap.account.exception.UserException;
import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import csz.mdm.dto.MdmUser;

import java.util.List;

public interface IMdmUserService extends IBaseService<MdmUser>, ProxySelf<IMdmUserService> {

    /**
     * 新增用户
     *
     * @param mdmUser
     * @param request
     * @return
     * @throws UserException
     */
    MdmUser insertMdmUser(MdmUser mdmUser, IRequest request) throws UserException;

    /**
     * 更新用户
     *
     * @param mdmUser
     * @param request
     * @return
     * @throws UserException
     */
    MdmUser updataMdmUser(MdmUser mdmUser, IRequest request) throws UserException;
}