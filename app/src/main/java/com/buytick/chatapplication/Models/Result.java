package com.buytick.chatapplication.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    /**
     * message : {"sender":{"id":3,"avatar":"https://ui-avatars.com/api/?name=fafa manzouri&bold=true&background=90465b&color=ffffff","status":"تاییده نشده","roles":[{"permissions":[{"id":1,"pivot":{"permission_id":1,"role_id":2},"created_at":"2019-05-28 00:26:08","label":"مشاهده کاربران","updated_at":"2019-05-28 21:58:49","name":"show-users"},{"id":2,"pivot":{"permission_id":2,"role_id":2},"created_at":"2019-05-28 00:26:17","label":"حذف کاربران","updated_at":"2019-05-28 00:26:17","name":"delete-users"}],"id":2,"pivot":{"role_id":2,"user_id":3},"created_at":"2019-05-28 00:26:52","label":"نویسنده","updated_at":"2019-05-28 00:26:52","name":"writer"}],"name":"fafa manzouri"},"id":79,"body":"4","updated_at":"2019-06-23 15:30:52","receiver":{"id":6,"avatar":"https://ui-avatars.com/api/?name=mohammad ghorbani&bold=true&background=992e91&color=ffffff","status":"تاییده نشده","roles":[{"permissions":[{"id":1,"pivot":{"permission_id":1,"role_id":1},"created_at":"2019-05-28 00:26:08","label":"مشاهده کاربران","updated_at":"2019-05-28 21:58:49","name":"show-users"},{"id":2,"pivot":{"permission_id":2,"role_id":1},"created_at":"2019-05-28 00:26:17","label":"حذف کاربران","updated_at":"2019-05-28 00:26:17","name":"delete-users"},{"id":3,"pivot":{"permission_id":3,"role_id":1},"created_at":"2019-05-28 03:37:55","label":"ویرایش کاربران","updated_at":"2019-05-28 03:37:55","name":"edit-users"},{"id":4,"pivot":{"permission_id":4,"role_id":1},"created_at":"2019-05-28 15:52:45","label":"مشاهده نقش ها","updated_at":"2019-05-28 15:52:45","name":"show-roles"},{"id":5,"pivot":{"permission_id":5,"role_id":1},"created_at":"2019-05-28 15:53:12","label":"ویرایش نقش ها","updated_at":"2019-05-28 15:53:12","name":"edit-roles"},{"id":6,"pivot":{"permission_id":6,"role_id":1},"created_at":"2019-05-28 15:53:50","label":"ایجاد نقش ها","updated_at":"2019-05-28 15:54:43","name":"create-roles"},{"id":7,"pivot":{"permission_id":7,"role_id":1},"created_at":"2019-05-28 15:54:10","label":"حذف نقش ها","updated_at":"2019-05-28 15:55:12","name":"delete-roles"}],"id":1,"pivot":{"role_id":1,"user_id":6},"created_at":"2019-05-28 00:26:34","label":"مدیر اصلی","updated_at":"2019-05-28 00:26:34","name":"admin"}],"name":"mohammad ghorbani"},"sender_id":3,"created_at":"1398/04/02 15:30:52","receiver_id":6}
     * socket : null
     */

    @SerializedName("message")
    private Message message;
    @SerializedName("socket")
    private Object socket;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Object getSocket() {
        return socket;
    }

    public void setSocket(Object socket) {
        this.socket = socket;
    }

    public static class Message {
        /**
         * sender : {"id":3,"avatar":"https://ui-avatars.com/api/?name=fafa manzouri&bold=true&background=90465b&color=ffffff","status":"تاییده نشده","roles":[{"permissions":[{"id":1,"pivot":{"permission_id":1,"role_id":2},"created_at":"2019-05-28 00:26:08","label":"مشاهده کاربران","updated_at":"2019-05-28 21:58:49","name":"show-users"},{"id":2,"pivot":{"permission_id":2,"role_id":2},"created_at":"2019-05-28 00:26:17","label":"حذف کاربران","updated_at":"2019-05-28 00:26:17","name":"delete-users"}],"id":2,"pivot":{"role_id":2,"user_id":3},"created_at":"2019-05-28 00:26:52","label":"نویسنده","updated_at":"2019-05-28 00:26:52","name":"writer"}],"name":"fafa manzouri"}
         * id : 79
         * body : 4
         * updated_at : 2019-06-23 15:30:52
         * receiver : {"id":6,"avatar":"https://ui-avatars.com/api/?name=mohammad ghorbani&bold=true&background=992e91&color=ffffff","status":"تاییده نشده","roles":[{"permissions":[{"id":1,"pivot":{"permission_id":1,"role_id":1},"created_at":"2019-05-28 00:26:08","label":"مشاهده کاربران","updated_at":"2019-05-28 21:58:49","name":"show-users"},{"id":2,"pivot":{"permission_id":2,"role_id":1},"created_at":"2019-05-28 00:26:17","label":"حذف کاربران","updated_at":"2019-05-28 00:26:17","name":"delete-users"},{"id":3,"pivot":{"permission_id":3,"role_id":1},"created_at":"2019-05-28 03:37:55","label":"ویرایش کاربران","updated_at":"2019-05-28 03:37:55","name":"edit-users"},{"id":4,"pivot":{"permission_id":4,"role_id":1},"created_at":"2019-05-28 15:52:45","label":"مشاهده نقش ها","updated_at":"2019-05-28 15:52:45","name":"show-roles"},{"id":5,"pivot":{"permission_id":5,"role_id":1},"created_at":"2019-05-28 15:53:12","label":"ویرایش نقش ها","updated_at":"2019-05-28 15:53:12","name":"edit-roles"},{"id":6,"pivot":{"permission_id":6,"role_id":1},"created_at":"2019-05-28 15:53:50","label":"ایجاد نقش ها","updated_at":"2019-05-28 15:54:43","name":"create-roles"},{"id":7,"pivot":{"permission_id":7,"role_id":1},"created_at":"2019-05-28 15:54:10","label":"حذف نقش ها","updated_at":"2019-05-28 15:55:12","name":"delete-roles"}],"id":1,"pivot":{"role_id":1,"user_id":6},"created_at":"2019-05-28 00:26:34","label":"مدیر اصلی","updated_at":"2019-05-28 00:26:34","name":"admin"}],"name":"mohammad ghorbani"}
         * sender_id : 3
         * created_at : 1398/04/02 15:30:52
         * receiver_id : 6
         */

        @SerializedName("sender")
        private Sender sender;
        @SerializedName("id")
        private String id;
        @SerializedName("body")
        private String body;
        @SerializedName("updated_at")
        private String updatedAt;
        @SerializedName("receiver")
        private Receiver receiver;
        @SerializedName("sender_id")
        private String senderId;
        @SerializedName("created_at")
        private String createdAt;
        @SerializedName("receiver_id")
        private String receiverId;

        public Sender getSender() {
            return sender;
        }

        public void setSender(Sender sender) {
            this.sender = sender;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Receiver getReceiver() {
            return receiver;
        }

        public void setReceiver(Receiver receiver) {
            this.receiver = receiver;
        }

        public String getSenderId() {
            return senderId;
        }

        public void setSenderId(String senderId) {
            this.senderId = senderId;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getReceiverId() {
            return receiverId;
        }

        public void setReceiverId(String receiverId) {
            this.receiverId = receiverId;
        }

        public static class Sender {
            /**
             * id : 3
             * avatar : https://ui-avatars.com/api/?name=fafa manzouri&bold=true&background=90465b&color=ffffff
             * status : تاییده نشده
             * roles : [{"permissions":[{"id":1,"pivot":{"permission_id":1,"role_id":2},"created_at":"2019-05-28 00:26:08","label":"مشاهده کاربران","updated_at":"2019-05-28 21:58:49","name":"show-users"},{"id":2,"pivot":{"permission_id":2,"role_id":2},"created_at":"2019-05-28 00:26:17","label":"حذف کاربران","updated_at":"2019-05-28 00:26:17","name":"delete-users"}],"id":2,"pivot":{"role_id":2,"user_id":3},"created_at":"2019-05-28 00:26:52","label":"نویسنده","updated_at":"2019-05-28 00:26:52","name":"writer"}]
             * name : fafa manzouri
             */

            @SerializedName("id")
            private int id;
            @SerializedName("avatar")
            private String avatar;
            @SerializedName("status")
            private String status;
            @SerializedName("name")
            private String name;
            @SerializedName("roles")
            private List<Roles> roles;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<Roles> getRoles() {
                return roles;
            }

            public void setRoles(List<Roles> roles) {
                this.roles = roles;
            }

            public static class Roles {
                /**
                 * permissions : [{"id":1,"pivot":{"permission_id":1,"role_id":2},"created_at":"2019-05-28 00:26:08","label":"مشاهده کاربران","updated_at":"2019-05-28 21:58:49","name":"show-users"},{"id":2,"pivot":{"permission_id":2,"role_id":2},"created_at":"2019-05-28 00:26:17","label":"حذف کاربران","updated_at":"2019-05-28 00:26:17","name":"delete-users"}]
                 * id : 2
                 * pivot : {"role_id":2,"user_id":3}
                 * created_at : 2019-05-28 00:26:52
                 * label : نویسنده
                 * updated_at : 2019-05-28 00:26:52
                 * name : writer
                 */

                @SerializedName("id")
                private int id;
                @SerializedName("pivot")
                private Pivot pivot;
                @SerializedName("created_at")
                private String createdAt;
                @SerializedName("label")
                private String label;
                @SerializedName("updated_at")
                private String updatedAt;
                @SerializedName("name")
                private String name;
                @SerializedName("permissions")
                private List<Permissions> permissions;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public Pivot getPivot() {
                    return pivot;
                }

                public void setPivot(Pivot pivot) {
                    this.pivot = pivot;
                }

                public String getCreatedAt() {
                    return createdAt;
                }

                public void setCreatedAt(String createdAt) {
                    this.createdAt = createdAt;
                }

                public String getLabel() {
                    return label;
                }

                public void setLabel(String label) {
                    this.label = label;
                }

                public String getUpdatedAt() {
                    return updatedAt;
                }

                public void setUpdatedAt(String updatedAt) {
                    this.updatedAt = updatedAt;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<Permissions> getPermissions() {
                    return permissions;
                }

                public void setPermissions(List<Permissions> permissions) {
                    this.permissions = permissions;
                }

                public static class Pivot {
                    /**
                     * role_id : 2
                     * user_id : 3
                     */

                    @SerializedName("role_id")
                    private int roleId;
                    @SerializedName("user_id")
                    private int userId;

                    public int getRoleId() {
                        return roleId;
                    }

                    public void setRoleId(int roleId) {
                        this.roleId = roleId;
                    }

                    public int getUserId() {
                        return userId;
                    }

                    public void setUserId(int userId) {
                        this.userId = userId;
                    }
                }

                public static class Permissions {
                    /**
                     * id : 1
                     * pivot : {"permission_id":1,"role_id":2}
                     * created_at : 2019-05-28 00:26:08
                     * label : مشاهده کاربران
                     * updated_at : 2019-05-28 21:58:49
                     * name : show-users
                     */

                    @SerializedName("id")
                    private int id;
                    @SerializedName("pivot")
                    private PivotX pivot;
                    @SerializedName("created_at")
                    private String createdAt;
                    @SerializedName("label")
                    private String label;
                    @SerializedName("updated_at")
                    private String updatedAt;
                    @SerializedName("name")
                    private String name;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public PivotX getPivot() {
                        return pivot;
                    }

                    public void setPivot(PivotX pivot) {
                        this.pivot = pivot;
                    }

                    public String getCreatedAt() {
                        return createdAt;
                    }

                    public void setCreatedAt(String createdAt) {
                        this.createdAt = createdAt;
                    }

                    public String getLabel() {
                        return label;
                    }

                    public void setLabel(String label) {
                        this.label = label;
                    }

                    public String getUpdatedAt() {
                        return updatedAt;
                    }

                    public void setUpdatedAt(String updatedAt) {
                        this.updatedAt = updatedAt;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public static class PivotX {
                        /**
                         * permission_id : 1
                         * role_id : 2
                         */

                        @SerializedName("permission_id")
                        private int permissionId;
                        @SerializedName("role_id")
                        private int roleId;

                        public int getPermissionId() {
                            return permissionId;
                        }

                        public void setPermissionId(int permissionId) {
                            this.permissionId = permissionId;
                        }

                        public int getRoleId() {
                            return roleId;
                        }

                        public void setRoleId(int roleId) {
                            this.roleId = roleId;
                        }
                    }
                }
            }
        }

        public static class Receiver {
            /**
             * id : 6
             * avatar : https://ui-avatars.com/api/?name=mohammad ghorbani&bold=true&background=992e91&color=ffffff
             * status : تاییده نشده
             * roles : [{"permissions":[{"id":1,"pivot":{"permission_id":1,"role_id":1},"created_at":"2019-05-28 00:26:08","label":"مشاهده کاربران","updated_at":"2019-05-28 21:58:49","name":"show-users"},{"id":2,"pivot":{"permission_id":2,"role_id":1},"created_at":"2019-05-28 00:26:17","label":"حذف کاربران","updated_at":"2019-05-28 00:26:17","name":"delete-users"},{"id":3,"pivot":{"permission_id":3,"role_id":1},"created_at":"2019-05-28 03:37:55","label":"ویرایش کاربران","updated_at":"2019-05-28 03:37:55","name":"edit-users"},{"id":4,"pivot":{"permission_id":4,"role_id":1},"created_at":"2019-05-28 15:52:45","label":"مشاهده نقش ها","updated_at":"2019-05-28 15:52:45","name":"show-roles"},{"id":5,"pivot":{"permission_id":5,"role_id":1},"created_at":"2019-05-28 15:53:12","label":"ویرایش نقش ها","updated_at":"2019-05-28 15:53:12","name":"edit-roles"},{"id":6,"pivot":{"permission_id":6,"role_id":1},"created_at":"2019-05-28 15:53:50","label":"ایجاد نقش ها","updated_at":"2019-05-28 15:54:43","name":"create-roles"},{"id":7,"pivot":{"permission_id":7,"role_id":1},"created_at":"2019-05-28 15:54:10","label":"حذف نقش ها","updated_at":"2019-05-28 15:55:12","name":"delete-roles"}],"id":1,"pivot":{"role_id":1,"user_id":6},"created_at":"2019-05-28 00:26:34","label":"مدیر اصلی","updated_at":"2019-05-28 00:26:34","name":"admin"}]
             * name : mohammad ghorbani
             */

            @SerializedName("id")
            private int id;
            @SerializedName("avatar")
            private String avatar;
            @SerializedName("status")
            private String status;
            @SerializedName("name")
            private String name;
            @SerializedName("roles")
            private List<RolesX> roles;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<RolesX> getRoles() {
                return roles;
            }

            public void setRoles(List<RolesX> roles) {
                this.roles = roles;
            }

            public static class RolesX {
                /**
                 * permissions : [{"id":1,"pivot":{"permission_id":1,"role_id":1},"created_at":"2019-05-28 00:26:08","label":"مشاهده کاربران","updated_at":"2019-05-28 21:58:49","name":"show-users"},{"id":2,"pivot":{"permission_id":2,"role_id":1},"created_at":"2019-05-28 00:26:17","label":"حذف کاربران","updated_at":"2019-05-28 00:26:17","name":"delete-users"},{"id":3,"pivot":{"permission_id":3,"role_id":1},"created_at":"2019-05-28 03:37:55","label":"ویرایش کاربران","updated_at":"2019-05-28 03:37:55","name":"edit-users"},{"id":4,"pivot":{"permission_id":4,"role_id":1},"created_at":"2019-05-28 15:52:45","label":"مشاهده نقش ها","updated_at":"2019-05-28 15:52:45","name":"show-roles"},{"id":5,"pivot":{"permission_id":5,"role_id":1},"created_at":"2019-05-28 15:53:12","label":"ویرایش نقش ها","updated_at":"2019-05-28 15:53:12","name":"edit-roles"},{"id":6,"pivot":{"permission_id":6,"role_id":1},"created_at":"2019-05-28 15:53:50","label":"ایجاد نقش ها","updated_at":"2019-05-28 15:54:43","name":"create-roles"},{"id":7,"pivot":{"permission_id":7,"role_id":1},"created_at":"2019-05-28 15:54:10","label":"حذف نقش ها","updated_at":"2019-05-28 15:55:12","name":"delete-roles"}]
                 * id : 1
                 * pivot : {"role_id":1,"user_id":6}
                 * created_at : 2019-05-28 00:26:34
                 * label : مدیر اصلی
                 * updated_at : 2019-05-28 00:26:34
                 * name : admin
                 */

                @SerializedName("id")
                private int id;
                @SerializedName("pivot")
                private PivotXX pivot;
                @SerializedName("created_at")
                private String createdAt;
                @SerializedName("label")
                private String label;
                @SerializedName("updated_at")
                private String updatedAt;
                @SerializedName("name")
                private String name;
                @SerializedName("permissions")
                private List<PermissionsX> permissions;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public PivotXX getPivot() {
                    return pivot;
                }

                public void setPivot(PivotXX pivot) {
                    this.pivot = pivot;
                }

                public String getCreatedAt() {
                    return createdAt;
                }

                public void setCreatedAt(String createdAt) {
                    this.createdAt = createdAt;
                }

                public String getLabel() {
                    return label;
                }

                public void setLabel(String label) {
                    this.label = label;
                }

                public String getUpdatedAt() {
                    return updatedAt;
                }

                public void setUpdatedAt(String updatedAt) {
                    this.updatedAt = updatedAt;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<PermissionsX> getPermissions() {
                    return permissions;
                }

                public void setPermissions(List<PermissionsX> permissions) {
                    this.permissions = permissions;
                }

                public static class PivotXX {
                    /**
                     * role_id : 1
                     * user_id : 6
                     */

                    @SerializedName("role_id")
                    private int roleId;
                    @SerializedName("user_id")
                    private int userId;

                    public int getRoleId() {
                        return roleId;
                    }

                    public void setRoleId(int roleId) {
                        this.roleId = roleId;
                    }

                    public int getUserId() {
                        return userId;
                    }

                    public void setUserId(int userId) {
                        this.userId = userId;
                    }
                }

                public static class PermissionsX {
                    /**
                     * id : 1
                     * pivot : {"permission_id":1,"role_id":1}
                     * created_at : 2019-05-28 00:26:08
                     * label : مشاهده کاربران
                     * updated_at : 2019-05-28 21:58:49
                     * name : show-users
                     */

                    @SerializedName("id")
                    private int id;
                    @SerializedName("pivot")
                    private PivotXXX pivot;
                    @SerializedName("created_at")
                    private String createdAt;
                    @SerializedName("label")
                    private String label;
                    @SerializedName("updated_at")
                    private String updatedAt;
                    @SerializedName("name")
                    private String name;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public PivotXXX getPivot() {
                        return pivot;
                    }

                    public void setPivot(PivotXXX pivot) {
                        this.pivot = pivot;
                    }

                    public String getCreatedAt() {
                        return createdAt;
                    }

                    public void setCreatedAt(String createdAt) {
                        this.createdAt = createdAt;
                    }

                    public String getLabel() {
                        return label;
                    }

                    public void setLabel(String label) {
                        this.label = label;
                    }

                    public String getUpdatedAt() {
                        return updatedAt;
                    }

                    public void setUpdatedAt(String updatedAt) {
                        this.updatedAt = updatedAt;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public static class PivotXXX {
                        /**
                         * permission_id : 1
                         * role_id : 1
                         */

                        @SerializedName("permission_id")
                        private int permissionId;
                        @SerializedName("role_id")
                        private int roleId;

                        public int getPermissionId() {
                            return permissionId;
                        }

                        public void setPermissionId(int permissionId) {
                            this.permissionId = permissionId;
                        }

                        public int getRoleId() {
                            return roleId;
                        }

                        public void setRoleId(int roleId) {
                            this.roleId = roleId;
                        }
                    }
                }
            }
        }
    }
}
