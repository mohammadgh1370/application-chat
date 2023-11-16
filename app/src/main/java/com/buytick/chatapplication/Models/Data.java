package com.buytick.chatapplication.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    /**
     * user_info : {"id":6,"phone":null,"updated_at":"2019-06-22 13:31:12","status":"تایید شده","email":"mohammadghorbani1992@gmail.com","roles":[{"permissions":[{"id":1,"pivot":{"permission_id":1,"role_id":1},"created_at":"2019-05-28 00:26:08","label":"مشاهده کاربران","updated_at":"2019-05-28 21:58:49","name":"show-users"},{"id":2,"pivot":{"permission_id":2,"role_id":1},"created_at":"2019-05-28 00:26:17","label":"حذف کاربران","updated_at":"2019-05-28 00:26:17","name":"delete-users"},{"id":3,"pivot":{"permission_id":3,"role_id":1},"created_at":"2019-05-28 03:37:55","label":"ویرایش کاربران","updated_at":"2019-05-28 03:37:55","name":"edit-users"},{"id":4,"pivot":{"permission_id":4,"role_id":1},"created_at":"2019-05-28 15:52:45","label":"مشاهده نقش ها","updated_at":"2019-05-28 15:52:45","name":"show-roles"},{"id":5,"pivot":{"permission_id":5,"role_id":1},"created_at":"2019-05-28 15:53:12","label":"ویرایش نقش ها","updated_at":"2019-05-28 15:53:12","name":"edit-roles"},{"id":6,"pivot":{"permission_id":6,"role_id":1},"created_at":"2019-05-28 15:53:50","label":"ایجاد نقش ها","updated_at":"2019-05-28 15:54:43","name":"create-roles"},{"id":7,"pivot":{"permission_id":7,"role_id":1},"created_at":"2019-05-28 15:54:10","label":"حذف نقش ها","updated_at":"2019-05-28 15:55:12","name":"delete-roles"}],"id":1,"pivot":{"role_id":1,"user_id":6},"created_at":"2019-05-28 00:26:34","label":"مدیر اصلی","updated_at":"2019-05-28 00:26:34","name":"admin"}],"name":"mohammad ghorbani","created_at":"1398/03/28 21:22:56","active":1,"avatar":"https://ui-avatars.com/api/?name=mohammad ghorbani&bold=true&background=992e91&color=ffffff","country_code":null,"email_verified_at":null}
     * socketId : 3FLm8lBR5Rm1r43eAAAH
     * user_id : 6
     */

    @SerializedName("user_info")
    private UserInfo userInfo;
    @SerializedName("socketId")
    private String socketId;
    @SerializedName("user_id")
    private String userId;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getSocketId() {
        return socketId;
    }

    public void setSocketId(String socketId) {
        this.socketId = socketId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public static class UserInfo {
        /**
         * id : 6
         * phone : null
         * updated_at : 2019-06-22 13:31:12
         * status : تایید شده
         * email : mohammadghorbani1992@gmail.com
         * roles : [{"permissions":[{"id":1,"pivot":{"permission_id":1,"role_id":1},"created_at":"2019-05-28 00:26:08","label":"مشاهده کاربران","updated_at":"2019-05-28 21:58:49","name":"show-users"},{"id":2,"pivot":{"permission_id":2,"role_id":1},"created_at":"2019-05-28 00:26:17","label":"حذف کاربران","updated_at":"2019-05-28 00:26:17","name":"delete-users"},{"id":3,"pivot":{"permission_id":3,"role_id":1},"created_at":"2019-05-28 03:37:55","label":"ویرایش کاربران","updated_at":"2019-05-28 03:37:55","name":"edit-users"},{"id":4,"pivot":{"permission_id":4,"role_id":1},"created_at":"2019-05-28 15:52:45","label":"مشاهده نقش ها","updated_at":"2019-05-28 15:52:45","name":"show-roles"},{"id":5,"pivot":{"permission_id":5,"role_id":1},"created_at":"2019-05-28 15:53:12","label":"ویرایش نقش ها","updated_at":"2019-05-28 15:53:12","name":"edit-roles"},{"id":6,"pivot":{"permission_id":6,"role_id":1},"created_at":"2019-05-28 15:53:50","label":"ایجاد نقش ها","updated_at":"2019-05-28 15:54:43","name":"create-roles"},{"id":7,"pivot":{"permission_id":7,"role_id":1},"created_at":"2019-05-28 15:54:10","label":"حذف نقش ها","updated_at":"2019-05-28 15:55:12","name":"delete-roles"}],"id":1,"pivot":{"role_id":1,"user_id":6},"created_at":"2019-05-28 00:26:34","label":"مدیر اصلی","updated_at":"2019-05-28 00:26:34","name":"admin"}]
         * name : mohammad ghorbani
         * created_at : 1398/03/28 21:22:56
         * active : 1
         * avatar : https://ui-avatars.com/api/?name=mohammad ghorbani&bold=true&background=992e91&color=ffffff
         * country_code : null
         * email_verified_at : null
         */

        @SerializedName("id")
        private String id;
        @SerializedName("phone")
        private Object phone;
        @SerializedName("updated_at")
        private String updatedAt;
        @SerializedName("status")
        private String status;
        @SerializedName("email")
        private String email;
        @SerializedName("name")
        private String name;
        @SerializedName("created_at")
        private String createdAt;
        @SerializedName("active")
        private int active;
        @SerializedName("avatar")
        private String avatar;
        @SerializedName("country_code")
        private Object countryCode;
        @SerializedName("email_verified_at")
        private Object emailVerifiedAt;
        @SerializedName("roles")
        private List<Roles> roles;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Object getPhone() {
            return phone;
        }

        public void setPhone(Object phone) {
            this.phone = phone;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public int getActive() {
            return active;
        }

        public void setActive(int active) {
            this.active = active;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public Object getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(Object countryCode) {
            this.countryCode = countryCode;
        }

        public Object getEmailVerifiedAt() {
            return emailVerifiedAt;
        }

        public void setEmailVerifiedAt(Object emailVerifiedAt) {
            this.emailVerifiedAt = emailVerifiedAt;
        }

        public List<Roles> getRoles() {
            return roles;
        }

        public void setRoles(List<Roles> roles) {
            this.roles = roles;
        }

        public static class Roles {
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

            public static class Permissions {
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
