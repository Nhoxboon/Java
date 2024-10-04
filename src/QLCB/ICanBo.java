package QLCB;

import java.sql.Connection;

public interface ICanBo {
    Connection getCon();

    boolean insertCB(CanBo canBo);
}