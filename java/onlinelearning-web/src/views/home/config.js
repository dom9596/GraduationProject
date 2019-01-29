/**
 * 教师  1001
 *学生  1002
 *普通管理员  1003
 * @type {{entity: null, childs: *[]}}
 */

let config = {
  "entity": null,
  "childs": [
    /*******************教师(id:1-20)*******************/
    {
      "entity": {
        "id": 1,
        "parentMenuId": 0,
        "name": "教师课程管理",
        "icon": "el-icon-bell",
        "alias": "课程管理",
        "state": "ENABLE",
        "sort": 0,
        "value": "/system/auth",
        "type": "LINK",
        "createUserId": 1,
        "role": 1001
      },
      "childs": null
    },
    {
      "entity": {
        "id": 2,
        "parentMenuId": 0,
        "name": "教师题目管理",
        "icon": "el-icon-bell",
        "alias": "题目管理",
        "state": "ENABLE",
        "sort": 1,
        "value": "/system/role",
        "type": "LINK",
        "createUserId": 1,
        "role": 1001
      },
      "childs": null
    },
    {
      "entity": {
        "id": 3,
        "parentMenuId": 0,
        "name": "教师班级管理",
        "icon": "el-icon-edit",
        "alias": "班级管理",
        "state": "ENABLE",
        "sort": 2,
        "value": "/system/menu",
        "type": "LINK",
        "createUserId": 1,
        "role": 1001
      },
      "childs": null
    },
    {
      "entity": {
        "id": 4,
        "parentMenuId": 0,
        "name": "教师学生管理",
        "icon": "el-icon-mobile-phone\r\n",
        "alias": "学生管理",
        "state": "ENABLE",
        "sort": 3,
        "value": "/system/group",
        "type": "LINK",
        "createUserId": 1,
        "role": 1001
      },
      "childs": null
    },
    {
      "entity": {
        "id": 5,
        "parentMenuId": 0,
        "name": "教师公告管理",
        "icon": "el-icon-bell\r\n",
        "alias": "公告管理",
        "state": "ENABLE",
        "sort": 3,
        "value": "/system/group",
        "type": "LINK",
        "createUserId": 1,
        "role": 1001
      },
      "childs": null
    },
    {
      "entity": {
        "id": 6,
        "parentMenuId": 0,
        "name": "教师个人信息",
        "icon": "el-icon-bell\r\n",
        "alias": "个人信息",
        "state": "ENABLE",
        "sort": 3,
        "value": "/system/group",
        "type": "LINK",
        "createUserId": 1,
        "role": 1001
      },
      "childs": null
    },
    /*******************学生(id:21-40)*******************/
    {
      "entity": {
        "id": 21,
        "parentMenuId": 0,
        "name": "学生班级管理",
        "icon": "el-icon-bell\r\n",
        "alias": "班级管理",
        "state": "ENABLE",
        "sort": 3,
        "value": "/system/group",
        "type": "LINK",
        "createUserId": 1,
        "role": 1002
      },
      "childs": null
    },
    {
      "entity": {
        "id": 22,
        "parentMenuId": 0,
        "name": "学生公告管理",
        "icon": "el-icon-bell\r\n",
        "alias": "公告管理",
        "state": "ENABLE",
        "sort": 3,
        "value": "/system/group",
        "type": "LINK",
        "createUserId": 1,
        "role": 1002
      },
      "childs": null
    },
    {
      "entity": {
        "id": 23,
        "parentMenuId": 0,
        "name": "学生个人信息",
        "icon": "el-icon-bell\r\n",
        "alias": "个人信息",
        "state": "ENABLE",
        "sort": 3,
        "value": "/system/group",
        "type": "LINK",
        "createUserId": 1,
        "role": 1002
      },
      "childs": null
    },
    /*******************管理员(id:41-60)*******************/
    {
      "entity": {
        "id": 41,
        "parentMenuId": 0,
        "name": "管理员课程信息",
        "icon": "el-icon-bell\r\n",
        "alias": "课程信息",
        "state": "ENABLE",
        "sort": 3,
        "value": "/system/group",
        "type": "LINK",
        "createUserId": 1,
        "role": 1003
      },
      "childs": null
    },
    {
      "entity": {
        "id": 42,
        "parentMenuId": 0,
        "name": "管理员班级管理",
        "icon": "el-icon-bell\r\n",
        "alias": "班级信息",
        "state": "ENABLE",
        "sort": 3,
        "value": "/system/group",
        "type": "LINK",
        "createUserId": 1,
        "role": 1003
      },
      "childs": null
    },
    {
      "entity": {
        "id": 43,
        "parentMenuId": 0,
        "name": "管理员用户管理",
        "icon": "el-icon-bell\r\n",
        "alias": "用户信息",
        "state": "ENABLE",
        "sort": 3,
        "value": "/system/group",
        "type": "LINK",
        "createUserId": 1,
        "role": 1003
      },
      "childs": null
    },
    {
      "entity": {
        "id": 44,
        "parentMenuId": 0,
        "name": "管理员问题",
        "icon": "el-icon-bell\r\n",
        "alias": "问题信息",
        "state": "ENABLE",
        "sort": 3,
        "value": "/system/group",
        "type": "LINK",
        "createUserId": 1,
        "role": 1003
      },
      "childs": null
    },
    {
      "entity": {
        "id": 45,
        "parentMenuId": 0,
        "name": "管理员通知管理",
        "icon": "el-icon-bell\r\n",
        "alias": "通知信息",
        "state": "ENABLE",
        "sort": 3,
        "value": "/system/group",
        "type": "LINK",
        "createUserId": 1,
        "role": 1003
      },
      "childs": null
    },
    {
      "entity": {
        "id": 41,
        "parentMenuId": 0,
        "name": "管理员个人信息",
        "icon": "el-icon-bell\r\n",
        "alias": "个人信息",
        "state": "ENABLE",
        "sort": 3,
        "value": "/system/group",
        "type": "LINK",
        "createUserId": 1,
        "role": 1003
      },
      "childs": null
    },
  ]
}
export default config
