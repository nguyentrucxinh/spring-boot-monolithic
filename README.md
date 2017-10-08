# TODO:

## [ ] @ManyToMany with @JoinTable (We just can use @JoinTable)
  + User table is @Many
  + Role table is @Many
  
  + Add role row is normal
  + Add user row is also mandatory have exist role_id, also add user_role row
  
  + Update role row is normal
  + Update user row is also mandatory have exist role_id, also update (delete all exist and add new row) user_role row
  
  + Delete role row is delete user_role use this role 
  + Delete user row is delete user_role use this user

---

## [ ] @ManyToOne & @OneToMany with @JoinTable (We can use @JoinColumns & @JoinTable)
  + Role table is @One
  + Permission table is @Many
  
  + Add role row is normal
  + Add permission row is also mandatory have exist role_id, also add role_permission row

  + Update role row is normal
  + Update permission is also mandatory have exist role_id, also update (delete all exist and add new row) role_permission row

  + Delete role row is also delete all permission use this role, also delete role_permission use this role
  + Delete permission is normal
 
---

## [ ] @OneToOne with @JoinColumns (We can use @JoinColumns, @JoinTable & @PrimaryKeyJoinColumn)
  + Person table is @One
  + PersonDetail table is @One
  
  + Add person row is normal
  + Add person_detail row is also mandatory have exist person_id
  
  + Update person row is normal
  + Update person_detail is also mandatory have exist person_id
  
  + Delete person is also delete person_detail row
  + Delete person_detail is normal