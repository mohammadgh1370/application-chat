package com.buytick.chatapplication.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Message {

    public static final int TYPE_SELF_MESSAGE = 0;
    public static final int TYPE_OTHER_MESSAGE = 1;
    public static final int TYPE_LOG = 2;
    public static final int TYPE_ACTION = 3;

    /**
     * id : 90
     * sender_id : 6
     * receiver_id : 6
     * body : 555
     * created_at : 1398/04/02 16:45:54
     * updated_at : 2019-06-23 16:45:54
     * selfMessage : true
     * sender : {"id":6,"name":"mohammad ghorbani","avatar":"https://ui-avatars.com/api/?name=mohammad ghorbani&bold=true&background=992e91&color=ffffff","status":"تاییده نشده","roles":[{"id":1,"name":"admin","label":"مدیر اصلی","created_at":"2019-05-28 00:26:34","updated_at":"2019-05-28 00:26:34","pivot":{"user_id":6,"role_id":1},"permissions":[{"id":1,"name":"show-users","label":"مشاهده کاربران","created_at":"2019-05-28 00:26:08","updated_at":"2019-05-28 21:58:49","pivot":{"role_id":1,"permission_id":1}},{"id":2,"name":"delete-users","label":"حذف کاربران","created_at":"2019-05-28 00:26:17","updated_at":"2019-05-28 00:26:17","pivot":{"role_id":1,"permission_id":2}},{"id":3,"name":"edit-users","label":"ویرایش کاربران","created_at":"2019-05-28 03:37:55","updated_at":"2019-05-28 03:37:55","pivot":{"role_id":1,"permission_id":3}},{"id":4,"name":"show-roles","label":"مشاهده نقش ها","created_at":"2019-05-28 15:52:45","updated_at":"2019-05-28 15:52:45","pivot":{"role_id":1,"permission_id":4}},{"id":5,"name":"edit-roles","label":"ویرایش نقش ها","created_at":"2019-05-28 15:53:12","updated_at":"2019-05-28 15:53:12","pivot":{"role_id":1,"permission_id":5}},{"id":6,"name":"create-roles","label":"ایجاد نقش ها","created_at":"2019-05-28 15:53:50","updated_at":"2019-05-28 15:54:43","pivot":{"role_id":1,"permission_id":6}},{"id":7,"name":"delete-roles","label":"حذف نقش ها","created_at":"2019-05-28 15:54:10","updated_at":"2019-05-28 15:55:12","pivot":{"role_id":1,"permission_id":7}}]}]}
     * receiver : {"id":6,"name":"mohammad ghorbani","avatar":"https://ui-avatars.com/api/?name=mohammad ghorbani&bold=true&background=992e91&color=ffffff","status":"تاییده نشده","roles":[{"id":1,"name":"admin","label":"مدیر اصلی","created_at":"2019-05-28 00:26:34","updated_at":"2019-05-28 00:26:34","pivot":{"user_id":6,"role_id":1},"permissions":[{"id":1,"name":"show-users","label":"مشاهده کاربران","created_at":"2019-05-28 00:26:08","updated_at":"2019-05-28 21:58:49","pivot":{"role_id":1,"permission_id":1}},{"id":2,"name":"delete-users","label":"حذف کاربران","created_at":"2019-05-28 00:26:17","updated_at":"2019-05-28 00:26:17","pivot":{"role_id":1,"permission_id":2}},{"id":3,"name":"edit-users","label":"ویرایش کاربران","created_at":"2019-05-28 03:37:55","updated_at":"2019-05-28 03:37:55","pivot":{"role_id":1,"permission_id":3}},{"id":4,"name":"show-roles","label":"مشاهده نقش ها","created_at":"2019-05-28 15:52:45","updated_at":"2019-05-28 15:52:45","pivot":{"role_id":1,"permission_id":4}},{"id":5,"name":"edit-roles","label":"ویرایش نقش ها","created_at":"2019-05-28 15:53:12","updated_at":"2019-05-28 15:53:12","pivot":{"role_id":1,"permission_id":5}},{"id":6,"name":"create-roles","label":"ایجاد نقش ها","created_at":"2019-05-28 15:53:50","updated_at":"2019-05-28 15:54:43","pivot":{"role_id":1,"permission_id":6}},{"id":7,"name":"delete-roles","label":"حذف نقش ها","created_at":"2019-05-28 15:54:10","updated_at":"2019-05-28 15:55:12","pivot":{"role_id":1,"permission_id":7}}]}]}
     */

    @SerializedName("id")
    private int id;
    @SerializedName("sender_id")
    private int senderId;
    @SerializedName("receiver_id")
    private int receiverId;
    @SerializedName("body")
    private String body;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("selfMessage")
    private boolean selfMessage;
    @SerializedName("sender")
    private Sender sender;
    @SerializedName("receiver")
    private Receiver receiver;
    private int type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isSelfMessage() {
        return selfMessage;
    }

    public void setSelfMessage(boolean selfMessage) {
        this.selfMessage = selfMessage;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public static class Sender {
        /**
         * id : 6
         * name : mohammad ghorbani
         * avatar : https://ui-avatars.com/api/?name=mohammad ghorbani&bold=true&background=992e91&color=ffffff
         * status : تاییده نشده
         * roles : [{"id":1,"name":"admin","label":"مدیر اصلی","created_at":"2019-05-28 00:26:34","updated_at":"2019-05-28 00:26:34","pivot":{"user_id":6,"role_id":1},"permissions":[{"id":1,"name":"show-users","label":"مشاهده کاربران","created_at":"2019-05-28 00:26:08","updated_at":"2019-05-28 21:58:49","pivot":{"role_id":1,"permission_id":1}},{"id":2,"name":"delete-users","label":"حذف کاربران","created_at":"2019-05-28 00:26:17","updated_at":"2019-05-28 00:26:17","pivot":{"role_id":1,"permission_id":2}},{"id":3,"name":"edit-users","label":"ویرایش کاربران","created_at":"2019-05-28 03:37:55","updated_at":"2019-05-28 03:37:55","pivot":{"role_id":1,"permission_id":3}},{"id":4,"name":"show-roles","label":"مشاهده نقش ها","created_at":"2019-05-28 15:52:45","updated_at":"2019-05-28 15:52:45","pivot":{"role_id":1,"permission_id":4}},{"id":5,"name":"edit-roles","label":"ویرایش نقش ها","created_at":"2019-05-28 15:53:12","updated_at":"2019-05-28 15:53:12","pivot":{"role_id":1,"permission_id":5}},{"id":6,"name":"create-roles","label":"ایجاد نقش ها","created_at":"2019-05-28 15:53:50","updated_at":"2019-05-28 15:54:43","pivot":{"role_id":1,"permission_id":6}},{"id":7,"name":"delete-roles","label":"حذف نقش ها","created_at":"2019-05-28 15:54:10","updated_at":"2019-05-28 15:55:12","pivot":{"role_id":1,"permission_id":7}}]}]
         */

        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        @SerializedName("avatar")
        private String avatar;
        @SerializedName("status")
        private String status;
        @SerializedName("email")
        private String email;
        private String password;
        private String password_confirmation;
        private String api_token;
        @SerializedName("roles")
        private List<Roles> roles;

        public Sender(String name, String email, String password, String password_confirmation) {
            this.name = name;
            this.email = email;
            this.password = password;
            this.password_confirmation = password_confirmation;
        }

        public Sender(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public Sender() {}

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getApi_token() {
            return api_token;
        }

        public void setApi_token(String api_token) {
            this.api_token = api_token;
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

        public List<Roles> getRoles() {
            return roles;
        }

        public void setRoles(List<Roles> roles) {
            this.roles = roles;
        }

        public String getPassword_confirmation() {
            return password_confirmation;
        }

        public void setPassword_confirmation(String password_confirmation) {
            this.password_confirmation = password_confirmation;
        }

        public static class Roles {
            /**
             * id : 1
             * name : admin
             * label : مدیر اصلی
             * created_at : 2019-05-28 00:26:34
             * updated_at : 2019-05-28 00:26:34
             * pivot : {"user_id":6,"role_id":1}
             * permissions : [{"id":1,"name":"show-users","label":"مشاهده کاربران","created_at":"2019-05-28 00:26:08","updated_at":"2019-05-28 21:58:49","pivot":{"role_id":1,"permission_id":1}},{"id":2,"name":"delete-users","label":"حذف کاربران","created_at":"2019-05-28 00:26:17","updated_at":"2019-05-28 00:26:17","pivot":{"role_id":1,"permission_id":2}},{"id":3,"name":"edit-users","label":"ویرایش کاربران","created_at":"2019-05-28 03:37:55","updated_at":"2019-05-28 03:37:55","pivot":{"role_id":1,"permission_id":3}},{"id":4,"name":"show-roles","label":"مشاهده نقش ها","created_at":"2019-05-28 15:52:45","updated_at":"2019-05-28 15:52:45","pivot":{"role_id":1,"permission_id":4}},{"id":5,"name":"edit-roles","label":"ویرایش نقش ها","created_at":"2019-05-28 15:53:12","updated_at":"2019-05-28 15:53:12","pivot":{"role_id":1,"permission_id":5}},{"id":6,"name":"create-roles","label":"ایجاد نقش ها","created_at":"2019-05-28 15:53:50","updated_at":"2019-05-28 15:54:43","pivot":{"role_id":1,"permission_id":6}},{"id":7,"name":"delete-roles","label":"حذف نقش ها","created_at":"2019-05-28 15:54:10","updated_at":"2019-05-28 15:55:12","pivot":{"role_id":1,"permission_id":7}}]
             */

            @SerializedName("id")
            private int id;
            @SerializedName("name")
            private String name;
            @SerializedName("label")
            private String label;
            @SerializedName("created_at")
            private String createdAt;
            @SerializedName("updated_at")
            private String updatedAt;
            @SerializedName("pivot")
            private Pivot pivot;
            @SerializedName("permissions")
            private List<Permissions> permissions;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }

            public Pivot getPivot() {
                return pivot;
            }

            public void setPivot(Pivot pivot) {
                this.pivot = pivot;
            }

            public List<Permissions> getPermissions() {
                return permissions;
            }

            public void setPermissions(List<Permissions> permissions) {
                this.permissions = permissions;
            }

            public static class Pivot {
                /**
                 * user_id : 6
                 * role_id : 1
                 */

                @SerializedName("user_id")
                private int userId;
                @SerializedName("role_id")
                private int roleId;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public int getRoleId() {
                    return roleId;
                }

                public void setRoleId(int roleId) {
                    this.roleId = roleId;
                }
            }

            public static class Permissions {
                /**
                 * id : 1
                 * name : show-users
                 * label : مشاهده کاربران
                 * created_at : 2019-05-28 00:26:08
                 * updated_at : 2019-05-28 21:58:49
                 * pivot : {"role_id":1,"permission_id":1}
                 */

                @SerializedName("id")
                private int id;
                @SerializedName("name")
                private String name;
                @SerializedName("label")
                private String label;
                @SerializedName("created_at")
                private String createdAt;
                @SerializedName("updated_at")
                private String updatedAt;
                @SerializedName("pivot")
                private PivotX pivot;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getLabel() {
                    return label;
                }

                public void setLabel(String label) {
                    this.label = label;
                }

                public String getCreatedAt() {
                    return createdAt;
                }

                public void setCreatedAt(String createdAt) {
                    this.createdAt = createdAt;
                }

                public String getUpdatedAt() {
                    return updatedAt;
                }

                public void setUpdatedAt(String updatedAt) {
                    this.updatedAt = updatedAt;
                }

                public PivotX getPivot() {
                    return pivot;
                }

                public void setPivot(PivotX pivot) {
                    this.pivot = pivot;
                }

                public static class PivotX {
                    /**
                     * role_id : 1
                     * permission_id : 1
                     */

                    @SerializedName("role_id")
                    private int roleId;
                    @SerializedName("permission_id")
                    private int permissionId;

                    public int getRoleId() {
                        return roleId;
                    }

                    public void setRoleId(int roleId) {
                        this.roleId = roleId;
                    }

                    public int getPermissionId() {
                        return permissionId;
                    }

                    public void setPermissionId(int permissionId) {
                        this.permissionId = permissionId;
                    }
                }
            }
        }

        public static class Builder {

            private String mEmail;
            private String mPassword;

            public Builder(String username){
                this.mEmail = username;
            }

            public Sender.Builder password(String password){
                this.mEmail = password;
                return this;
            }

            public Sender build() {
                Sender sender = new Sender();
                sender.setName(mEmail);
                sender.setPassword(mPassword);
                return sender;
            }
        }
    }

    public static class Receiver {
        /**
         * id : 6
         * name : mohammad ghorbani
         * avatar : https://ui-avatars.com/api/?name=mohammad ghorbani&bold=true&background=992e91&color=ffffff
         * status : تاییده نشده
         * roles : [{"id":1,"name":"admin","label":"مدیر اصلی","created_at":"2019-05-28 00:26:34","updated_at":"2019-05-28 00:26:34","pivot":{"user_id":6,"role_id":1},"permissions":[{"id":1,"name":"show-users","label":"مشاهده کاربران","created_at":"2019-05-28 00:26:08","updated_at":"2019-05-28 21:58:49","pivot":{"role_id":1,"permission_id":1}},{"id":2,"name":"delete-users","label":"حذف کاربران","created_at":"2019-05-28 00:26:17","updated_at":"2019-05-28 00:26:17","pivot":{"role_id":1,"permission_id":2}},{"id":3,"name":"edit-users","label":"ویرایش کاربران","created_at":"2019-05-28 03:37:55","updated_at":"2019-05-28 03:37:55","pivot":{"role_id":1,"permission_id":3}},{"id":4,"name":"show-roles","label":"مشاهده نقش ها","created_at":"2019-05-28 15:52:45","updated_at":"2019-05-28 15:52:45","pivot":{"role_id":1,"permission_id":4}},{"id":5,"name":"edit-roles","label":"ویرایش نقش ها","created_at":"2019-05-28 15:53:12","updated_at":"2019-05-28 15:53:12","pivot":{"role_id":1,"permission_id":5}},{"id":6,"name":"create-roles","label":"ایجاد نقش ها","created_at":"2019-05-28 15:53:50","updated_at":"2019-05-28 15:54:43","pivot":{"role_id":1,"permission_id":6}},{"id":7,"name":"delete-roles","label":"حذف نقش ها","created_at":"2019-05-28 15:54:10","updated_at":"2019-05-28 15:55:12","pivot":{"role_id":1,"permission_id":7}}]}]
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("avatar")
        private String avatar;
        @SerializedName("status")
        private String status;
        @SerializedName("roles")
        private List<RolesX> roles;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public List<RolesX> getRoles() {
            return roles;
        }

        public void setRoles(List<RolesX> roles) {
            this.roles = roles;
        }

        public static class RolesX {
            /**
             * id : 1
             * name : admin
             * label : مدیر اصلی
             * created_at : 2019-05-28 00:26:34
             * updated_at : 2019-05-28 00:26:34
             * pivot : {"user_id":6,"role_id":1}
             * permissions : [{"id":1,"name":"show-users","label":"مشاهده کاربران","created_at":"2019-05-28 00:26:08","updated_at":"2019-05-28 21:58:49","pivot":{"role_id":1,"permission_id":1}},{"id":2,"name":"delete-users","label":"حذف کاربران","created_at":"2019-05-28 00:26:17","updated_at":"2019-05-28 00:26:17","pivot":{"role_id":1,"permission_id":2}},{"id":3,"name":"edit-users","label":"ویرایش کاربران","created_at":"2019-05-28 03:37:55","updated_at":"2019-05-28 03:37:55","pivot":{"role_id":1,"permission_id":3}},{"id":4,"name":"show-roles","label":"مشاهده نقش ها","created_at":"2019-05-28 15:52:45","updated_at":"2019-05-28 15:52:45","pivot":{"role_id":1,"permission_id":4}},{"id":5,"name":"edit-roles","label":"ویرایش نقش ها","created_at":"2019-05-28 15:53:12","updated_at":"2019-05-28 15:53:12","pivot":{"role_id":1,"permission_id":5}},{"id":6,"name":"create-roles","label":"ایجاد نقش ها","created_at":"2019-05-28 15:53:50","updated_at":"2019-05-28 15:54:43","pivot":{"role_id":1,"permission_id":6}},{"id":7,"name":"delete-roles","label":"حذف نقش ها","created_at":"2019-05-28 15:54:10","updated_at":"2019-05-28 15:55:12","pivot":{"role_id":1,"permission_id":7}}]
             */

            @SerializedName("id")
            private int id;
            @SerializedName("name")
            private String name;
            @SerializedName("label")
            private String label;
            @SerializedName("created_at")
            private String createdAt;
            @SerializedName("updated_at")
            private String updatedAt;
            @SerializedName("pivot")
            private PivotXX pivot;
            @SerializedName("permissions")
            private List<PermissionsX> permissions;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }

            public PivotXX getPivot() {
                return pivot;
            }

            public void setPivot(PivotXX pivot) {
                this.pivot = pivot;
            }

            public List<PermissionsX> getPermissions() {
                return permissions;
            }

            public void setPermissions(List<PermissionsX> permissions) {
                this.permissions = permissions;
            }

            public static class PivotXX {
                /**
                 * user_id : 6
                 * role_id : 1
                 */

                @SerializedName("user_id")
                private int userId;
                @SerializedName("role_id")
                private int roleId;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public int getRoleId() {
                    return roleId;
                }

                public void setRoleId(int roleId) {
                    this.roleId = roleId;
                }
            }

            public static class PermissionsX {
                /**
                 * id : 1
                 * name : show-users
                 * label : مشاهده کاربران
                 * created_at : 2019-05-28 00:26:08
                 * updated_at : 2019-05-28 21:58:49
                 * pivot : {"role_id":1,"permission_id":1}
                 */

                @SerializedName("id")
                private int id;
                @SerializedName("name")
                private String name;
                @SerializedName("label")
                private String label;
                @SerializedName("created_at")
                private String createdAt;
                @SerializedName("updated_at")
                private String updatedAt;
                @SerializedName("pivot")
                private PivotXXX pivot;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getLabel() {
                    return label;
                }

                public void setLabel(String label) {
                    this.label = label;
                }

                public String getCreatedAt() {
                    return createdAt;
                }

                public void setCreatedAt(String createdAt) {
                    this.createdAt = createdAt;
                }

                public String getUpdatedAt() {
                    return updatedAt;
                }

                public void setUpdatedAt(String updatedAt) {
                    this.updatedAt = updatedAt;
                }

                public PivotXXX getPivot() {
                    return pivot;
                }

                public void setPivot(PivotXXX pivot) {
                    this.pivot = pivot;
                }

                public static class PivotXXX {
                    /**
                     * role_id : 1
                     * permission_id : 1
                     */

                    @SerializedName("role_id")
                    private int roleId;
                    @SerializedName("permission_id")
                    private int permissionId;

                    public int getRoleId() {
                        return roleId;
                    }

                    public void setRoleId(int roleId) {
                        this.roleId = roleId;
                    }

                    public int getPermissionId() {
                        return permissionId;
                    }

                    public void setPermissionId(int permissionId) {
                        this.permissionId = permissionId;
                    }
                }
            }
        }
    }

    public static class Builder {

        private final int mType;
        private String mUsername;
        private String mMessage;
        private boolean mSelfMessage;

        public Builder(int type) {
            mType = type;
        }

        public Message.Builder username(String username) {
            mUsername = username;
            return this;
        }

        public Message.Builder message(String message) {
            mMessage = message;
            return this;
        }

        public Message.Builder selfMessage(boolean selfMessage) {
            mSelfMessage = selfMessage;
            return this;
        }

        public Message build() {
            Message message = new Message();
            Sender user = new Sender();
            message.type = mType;
            message.sender = new Sender.Builder(mUsername).build();
            message.body = mMessage;
            message.selfMessage = mSelfMessage;
            return message;
        }
    }
}
