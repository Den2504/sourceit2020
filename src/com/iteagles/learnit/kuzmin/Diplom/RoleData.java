package com.iteagles.learnit.kuzmin.Diplom;

public class RoleData {
	private int roleId;
	private String roleName;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "RoleData [RoleId= " + roleId + ", RoleName= " + roleName + "]";
	}
}
