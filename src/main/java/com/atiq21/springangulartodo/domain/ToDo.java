package com.atiq21.springangulartodo.domain;

import java.util.Date;

/**
 * @author Atiqur Rahman
 * @since 03/06/2015 7:55 PM
 */
public class ToDo {
    private String title;
    private Date dueDate;
    private Date completedDate;

    public ToDo(String title, Date dueDate) {
        this.title = title;
        this.dueDate = dueDate;
    }

    public ToDo(String title, Date dueDate, Date completedDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.completedDate = completedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDo toDo = (ToDo) o;

        if (completedDate != null ? !completedDate.equals(toDo.completedDate) : toDo.completedDate != null) return false;
        if (dueDate != null ? !dueDate.equals(toDo.dueDate) : toDo.dueDate != null) return false;
        if (title != null ? !title.equals(toDo.title) : toDo.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (dueDate != null ? dueDate.hashCode() : 0);
        result = 31 * result + (completedDate != null ? completedDate.hashCode() : 0);
        return result;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ToDo");
        sb.append("{title='").append(title).append('\'');
        sb.append(", dueDate=").append(dueDate);
        sb.append(", completedDate=").append(completedDate);
        sb.append('}');
        return sb.toString();
    }
}
